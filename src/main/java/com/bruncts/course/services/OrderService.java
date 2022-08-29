package com.bruncts.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruncts.course.entities.Order;
import com.bruncts.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findall() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order>  obj = repository.findById(id);
		return obj.get();
	}
	
}
