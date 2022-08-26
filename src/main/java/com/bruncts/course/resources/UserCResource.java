package com.bruncts.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruncts.course.entities.UserC;

@RestController
@RequestMapping(value = "/users")
public class UserCResource {
	
	@GetMapping
	public ResponseEntity<UserC> findAll(){
		UserC u = new UserC(1L,"Maria","maria@gmail.com","999999","12345");
		return ResponseEntity.ok().body(u);
	}
}
;