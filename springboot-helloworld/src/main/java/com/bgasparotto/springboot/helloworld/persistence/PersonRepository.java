package com.bgasparotto.springboot.helloworld.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bgasparotto.springboot.helloworld.model.Person;

/**
 * Repository class for {@code Person}.
 * 
 * @author Bruno Gasparotto
 *
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}