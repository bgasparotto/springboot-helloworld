package com.bgasparotto.springboot.helloworld.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bgasparotto.springboot.helloworld.model.Person;
import com.bgasparotto.springboot.helloworld.service.PersonService;

/**
 * REST controller for the {@code Person} resource.
 * 
 * @author Bruno Gasparotto
 *
 */
@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	private PersonService service;

	/**
	 * List all the available {@code Person} resources in the system.
	 * 
	 * @return Collection of {@code Person}
	 */
	@GetMapping
	public List<Person> findAll() {
		return service.findAll();
	}
}