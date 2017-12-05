package com.bgasparotto.springboot.helloworld.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bgasparotto.springboot.helloworld.model.Person;
import com.bgasparotto.springboot.helloworld.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@GetMapping
	public List<Person> findAll() {
		return service.findAll();
	}
}