package com.pos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pos.models.Person;
import com.pos.services.PersonService;

@RestController
@RequestMapping(value = "/person")
public class PersonResource {

	@Autowired
	private PersonService personService;
	
	@GetMapping
	public List<Person> listar(){
		return personService.listAll();
	}
	
	@PostMapping
	public ResponseEntity<?> criar(@PathVariable String idParty, @RequestBody Person person){
		return ResponseEntity.ok(personService.salvar(Long.parseLong(idParty), person));
	}
	
	@DeleteMapping(value = "/{id}")
	public void deletar(@PathVariable String id){
		personService.delete(Long.parseLong(id));
	}
	
	@PutMapping(value = "/{id}")
	public void atualiza(@PathVariable String id, @RequestBody Person person) {
		personService.salvar(Long.parseLong(id), person);
	}
}
