package com.pos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pos.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}