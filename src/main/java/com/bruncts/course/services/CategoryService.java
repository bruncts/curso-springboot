package com.bruncts.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruncts.course.entities.Category;
import com.bruncts.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findall() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category>  obj = repository.findById(id);
		return obj.get();
	}
	
}
