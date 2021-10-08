package com.pos.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_organization")
public class Organization implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idOrganization;

	@JsonIgnore
	@OneToMany(mappedBy = "organization")
	private List<Party> partys = new ArrayList<>();

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate startDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate endDate;
	

	public Organization() {
		
	}


	public Organization(Long idOrganization, List<Party> partys, LocalDate startDate, LocalDate endDate) {
		super();
		this.idOrganization = idOrganization;
		this.partys = partys;
		this.startDate = startDate;
		this.endDate = endDate;
	}


	public Long getIdOrganization() {
		return idOrganization;
	}


	public void setIdOrganization(Long idOrganization) {
		this.idOrganization = idOrganization;
	}


	public List<Party> getPartys() {
		return partys;
	}


	public void setPartys(List<Party> partys) {
		this.partys = partys;
	}


	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public LocalDate getEndDate() {
		return endDate;
	}


	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}




}
