package com.pos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.models.Person;
import com.pos.repositories.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;
	
	public Person salvar(Long idParty, Person person) {
		return personRepository.save(person);
	}
	
	public List<Person> listAll(){
		return personRepository.findAll();
	}
	
	public Optional<Person> getById(Long idPerson) {
		return personRepository.findById(idPerson);
	}
	
	public void delete(Long idPerson) {
		personRepository.deleteById(idPerson);
	}

}
