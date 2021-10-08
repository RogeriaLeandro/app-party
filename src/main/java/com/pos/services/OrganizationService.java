package com.pos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.models.Organization;
import com.pos.repositories.OrganizationRepository;

@Service
public class OrganizationService {
	@Autowired
	private OrganizationRepository organizationRepository;

	public Organization salvar(Long idParty, Organization organization) {
		return organizationRepository.save(organization);
	}
	
	public List<Organization> listAll(){
		return organizationRepository.findAll();
	}
	
	public Optional<Organization> getById(Long idOrganization) {
		return organizationRepository.findById(idOrganization);
	}
	
	public void delete(Long idOrganization) {
		organizationRepository.deleteById(idOrganization);
	}
	
	
}
