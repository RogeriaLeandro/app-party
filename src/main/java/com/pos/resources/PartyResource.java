package com.pos.resources;

import java.util.List;
import java.util.Optional;

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

import com.pos.models.Party;
import com.pos.services.PartyService;

@RestController
@RequestMapping(value = "/party")
public class PartyResource {

	@Autowired
	private PartyService partyService;
	
	
	@GetMapping
	public List<Party> listar(){
		return partyService.listAll();
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Party> listarPorId(@PathVariable("id") String idparty){
		return partyService.getById(Long.parseLong(idparty));
	}
	
	@PostMapping
	public ResponseEntity<?> criar(@PathVariable String idParty, @RequestBody Party party){
		return ResponseEntity.ok(partyService.salvar(Long.parseLong(idParty), party));
	}
	
	@DeleteMapping(value = "/{id}")
	public void deletar(@PathVariable String id){
		partyService.delete(Long.parseLong(id));
	}
	
	@PutMapping(value = "/{id}")
	public void atualiza(@PathVariable String id, @RequestBody Party party) {
		partyService.salvar(Long.parseLong(id), party);
	}


}
