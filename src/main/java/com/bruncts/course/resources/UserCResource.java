package com.bruncts.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruncts.course.entities.UserC;
import com.bruncts.course.services.UserCService;

@RestController
@RequestMapping(value = "/users")
public class UserCResource {
	
	@Autowired
	private UserCService service;
	
	@GetMapping
	public ResponseEntity<List<UserC>> findAll(){
		List<UserC> list = service.findall();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserC> findById(@PathVariable Long id){
		UserC obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
;