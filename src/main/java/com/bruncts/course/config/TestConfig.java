package com.bruncts.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.bruncts.course.entities.UserC;
import com.bruncts.course.repositories.UserCRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserCRepository userCRepository;

	@Override
	public void run(String... args) throws Exception {
		UserC u1 = new UserC(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		UserC u2 = new UserC(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userCRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
