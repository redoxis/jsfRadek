package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Person;

@ApplicationScoped
public class PersonManager {
	private List<Person> db = new ArrayList<Person>();

	public void addPerson(Person person) {
		Person newPerson = new Person();

		newPerson.setFirstName(person.getFirstName());
		newPerson.setLastName(person.getLastName());
		newPerson.setPesel(person.getPesel());
		newPerson.setZipCode(person.getZipCode());
		newPerson.setCity(person.getCity());
		newPerson.setStreet(person.getStreet());
		newPerson.setDateOfBirth(person.getDateOfBirth());
		newPerson.setWeight(person.getWeight());
		newPerson.setPhone(person.getPhone());
		newPerson.setGrowth(person.getGrowth());
				
		
		db.add(newPerson);
	}

	// Removes the person with given PIN
	public void deletePerson(Person person) {
			
			db.remove(person);
	}

	public List<Person> getAllPersons() {
		return db;
	}
}
