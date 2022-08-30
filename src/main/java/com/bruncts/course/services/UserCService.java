package com.bruncts.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.bruncts.course.entities.UserC;
import com.bruncts.course.repositories.UserCRepository;
import com.bruncts.course.services.exceptions.DatabaseException;
import com.bruncts.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserCService {
	
	@Autowired
	private UserCRepository repository;
	
	public List<UserC> findall() {
		return repository.findAll();
	}
	
	public UserC findById(Long id) {
		Optional<UserC>  obj = repository.findById(id);
		return obj.orElseThrow(()-> new ResourceNotFoundException(id));
	}
	
	public UserC insert(UserC obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
		repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public UserC update(Long id, UserC obj) {
		UserC entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(UserC entity, UserC obj) {
		entity.setName(obj.getName());	
		entity.setEmail(obj.getEmail());	
		entity.setPhone(obj.getPhone());	
	}
	
}
