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

import com.pos.models.Guest;
import com.pos.services.GuestService;

@RestController
@RequestMapping(value = "/guest")
public class GuestResource {

	@Autowired
	private GuestService guestService;
	
	
	@GetMapping
	public List<Guest> listar(){
		return guestService.listAll();
		
	}
	
	@PostMapping
	public ResponseEntity<?> criar(@PathVariable String idGuest, @RequestBody Guest party){
		return ResponseEntity.ok(guestService.salvar(Long.parseLong(idGuest), party));
	}
	
	@DeleteMapping(value = "/{id}")
	public void deletar(@PathVariable String id){
		guestService.delete(Long.parseLong(id));
	}
	
	@PutMapping(value = "/{id}")
	public void atualiza(@PathVariable String id, @RequestBody Guest guest) {
		guestService.salvar(Long.parseLong(id), guest);
	}

}
