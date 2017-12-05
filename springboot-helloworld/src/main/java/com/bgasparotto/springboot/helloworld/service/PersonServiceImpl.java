package com.bgasparotto.springboot.helloworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bgasparotto.springboot.helloworld.model.Person;
import com.bgasparotto.springboot.helloworld.persistence.PersonRepository;

/**
 * Service implementation for {@link PersonService} interface.
 * 
 * @author Bruno Gasparotto
 *
 */
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository repository;

	@Override
	public List<Person> findAll() {
		List<Person> persons = repository.findAll();
		persons.removeIf(p -> p.getId() == 999999);

		return persons;
	}
}