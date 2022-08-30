package com.bruncts.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruncts.course.entities.UserC;
import com.bruncts.course.repositories.UserCRepository;

@Service
public class UserCService {
	
	@Autowired
	private UserCRepository repository;
	
	public List<UserC> findall() {
		return repository.findAll();
	}
	
	public UserC findById(Long id) {
		Optional<UserC>  obj = repository.findById(id);
		return obj.get();
	}
	
	public UserC insert(UserC obj) {
		return repository.save(obj);
	}
	
}
