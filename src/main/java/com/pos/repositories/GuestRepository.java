package com.pos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pos.models.Guest;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {

}