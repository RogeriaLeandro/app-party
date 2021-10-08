package com.pos.models;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_person")
public class Person implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idPerson;

	private String name;
	
	private String tel;
	
	private String nationatily;
	
	public Person() {
		
	}

	public Person(Long idPerson, String name, String tel, String nationatily) {
		super();
		this.idPerson = idPerson;
		this.name = name;
		this.tel = tel;
		this.nationatily = nationatily;
	}


	public Long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getNationatily() {
		return nationatily;
	}

	public void setNationatily(String nationatily) {
		this.nationatily = nationatily;
	}


	@Override
	public String toString() {
		return "Person [idPerson=" + idPerson + ", name=" + name + ", tel=" + tel + ", nationatily=" + nationatily
				+ "]";
	}
	
	
	
}