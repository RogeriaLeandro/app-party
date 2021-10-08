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

import com.pos.models.Organization;
import com.pos.services.OrganizationService;

@RestController
@RequestMapping(value = "/organization")
public class OrganizationResource {

	@Autowired
	private OrganizationService organizationService;
	
	
	@GetMapping
	public List<Organization> listar(){
		return organizationService.listAll();
	}
	
	@PostMapping
	public ResponseEntity<?> criar(@PathVariable String idOrganization, @RequestBody Organization organization){
		return ResponseEntity.ok(organizationService.salvar(Long.parseLong(idOrganization), organization));
	}
	
	@DeleteMapping(value = "/{id}")
	public void deletar(@PathVariable String id){
		organizationService.delete(Long.parseLong(id));
	}
	
	@PutMapping(value = "/{id}")
	public void atualiza(@PathVariable String id, @RequestBody Organization organization) {
		organizationService.salvar(Long.parseLong(id), organization);
	}

}
