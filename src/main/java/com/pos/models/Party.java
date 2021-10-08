package com.pos.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_party")
public class Party implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idParty;
	
	private String name;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id.person")
	private Person person;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id.organization")
	private Organization organization;
	

	@OneToMany(mappedBy = "party")
	private List<Guest> guests = new ArrayList<>();

	private String description;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate effectiveDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate suspensionDate;
	
	
	public Party() {
		
	}

	public Party(Long idParty, String name, Person person, Organization organization,
			String description, LocalDate effectiveDate, LocalDate suspensionDate) {
		super();	
		this.idParty = idParty;
		this.name = name;
		this.person = person;
		this.organization = organization;
		this.description = description;
		this.effectiveDate = effectiveDate;
		this.suspensionDate = suspensionDate;
	}

	public void setIdParty(Long idParty) {
		this.idParty = idParty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
		
	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(LocalDate effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public LocalDate getSuspensionDate() {
		return suspensionDate;
	}

	public void setSuspensionDate(LocalDate suspensionDate) {
		this.suspensionDate = suspensionDate;
	}


	public List<Guest> getGuests() {
		return guests;
	}

	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}

	public Long getIdParty() {
		return idParty;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idParty);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Party other = (Party) obj;
		return Objects.equals(idParty, other.idParty);
	}

	@Override
	public String toString() {
		return "PartyName [identifier=" + idParty + ", name=" + name + ", person=" + person + ", description="
				+ description + ", effectiveDate=" + effectiveDate + ", suspensionDate=" + suspensionDate + "]";
	}


	
	
	
}
