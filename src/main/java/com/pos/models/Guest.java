package com.pos.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_guest")
public class Guest implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idGuest;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id.party")	
	private Party party;
	
	@OneToOne
	@JoinColumn(name = "id.person")	
	private Person person;
	
	private Boolean confirmated;
	
	
	public Guest() {
		
	}

	public Guest(Long idGuest, Party party, Person person, Boolean confirmated) {
		super();
		this.idGuest = idGuest;
		this.party = party;
		this.person = person;
		this.confirmated = confirmated;
	}

	public Long getIdGuest() {
		return idGuest;
	}

	public void setIdGuest(Long idGuest) {
		this.idGuest = idGuest;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Boolean getConfirmated() {
		return confirmated;
	}

	public void setConfirmated(Boolean confirmated) {
		this.confirmated = confirmated;
	}

	@Override
	public int hashCode() {
		return Objects.hash(confirmated, idGuest, party, person);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guest other = (Guest) obj;
		return Objects.equals(confirmated, other.confirmated) && Objects.equals(idGuest, other.idGuest)
				&& Objects.equals(party, other.party) && Objects.equals(person, other.person);
	}

	@Override
	public String toString() {
		return "Guest [idGuest=" + idGuest + ", party=" + party + ", person=" + person + ", confirmated=" + confirmated
				+ "]";
	}
	
}
