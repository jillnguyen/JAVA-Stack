package com.jillnguyen.driverlicense.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jillnguyen.driverlicense.models.Person;
import com.jillnguyen.driverlicense.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepository;
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
//	retrieve all persons
	public List<Person> allPersons(){
		return personRepository.findAll();
	}
//	create a person
	public Person createPerson(Person p) {
		return personRepository.save(p);
	}
	
//	retrieve one person
	public Person getPerson(Long id) {
		Optional<Person> person= personRepository.findById(id);
		if(person.isPresent()) {
			return person.get();
		} else {
			return null;
		}
	}
	
	
}
