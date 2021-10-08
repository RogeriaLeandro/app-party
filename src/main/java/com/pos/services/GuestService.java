package com.pos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.models.Guest;
import com.pos.repositories.GuestRepository;

@Service
public class GuestService {
	
	@Autowired
	private GuestRepository guestRepository;
	
	
	public Guest salvar(Long idGuest, Guest guest) {
		return guestRepository.save(guest);
	}
	
	public List<Guest> listAll(){
		return guestRepository.findAll();
	}
	
	public Optional<Guest> getById(Long idGuest) {
		return guestRepository.findById(idGuest);
	}
	
	public void delete(Long idGuest) {
		guestRepository.deleteById(idGuest);
	}
}

