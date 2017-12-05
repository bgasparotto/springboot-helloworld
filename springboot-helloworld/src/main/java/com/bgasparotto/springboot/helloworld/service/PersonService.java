package com.bgasparotto.springboot.helloworld.service;

import java.util.List;

import com.bgasparotto.springboot.helloworld.model.Person;

/**
 * Service interface for {@code Person}.
 * 
 * @author Bruno Gasparotto
 *
 */
public interface PersonService {

	/**
	 * Find all of the {@code Person} objects in the system,
	 * <strong>excluding</strong> admin or system objects, if any.
	 * 
	 * @return {@code List} of {@code Person}
	 */
	List<Person> findAll();
}