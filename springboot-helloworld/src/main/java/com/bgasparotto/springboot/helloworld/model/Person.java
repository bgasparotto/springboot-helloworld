package com.bgasparotto.springboot.helloworld.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity class for {@code Person}.
 * 
 * @author Bruno Gasparotto
 *
 */
@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String firstName;
	private String lastName;

	/**
	 * Gets the Person's {@code id}.
	 *
	 * @return The Person's {@code id}
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Gets the Person's {@code firstName}.
	 *
	 * @return The Person's {@code firstName}
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Gets the Person's {@code lastName}.
	 *
	 * @return The Person's {@code lastName}
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the Person's {@code id}.
	 *
	 * @param id
	 *            The Person's {@code id} to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Sets the Person's {@code firstName}.
	 *
	 * @param firstName
	 *            The Person's {@code firstName} to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Sets the Person's {@code lastName}.
	 *
	 * @param lastName
	 *            The Person's {@code lastName} to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append("]");
		return builder.toString();
	}
}