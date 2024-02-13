package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int p_id;
	private String name;
	private String email;
	
	public Person() {
	}

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public int getp_id() {
		return p_id;
	}

	public String getname() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setPid(int p_id) {
		this.p_id = p_id;
	}

	public void setPname(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}