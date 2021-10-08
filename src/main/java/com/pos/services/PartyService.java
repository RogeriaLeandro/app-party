package com.pos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.pos.models.Party;
import com.pos.repositories.PartyRepository;

@Service
public class PartyService {
	
	@Autowired
	private PartyRepository partyRepository;
	
	public Party salvar(Long idParty, Party party) {
		return partyRepository.save(party);
	}
	
	public List<Party> listAll(){
		return partyRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
	}
	
	public Optional<Party> getById(Long idParty) {
		return partyRepository.findById(idParty);
	}
	
	public void delete(Long idParty) {
		partyRepository.deleteById(idParty);
	}

}
