package com.pos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pos.models.Party;

@Repository
public interface PartyRepository extends JpaRepository<Party, Long> {

}