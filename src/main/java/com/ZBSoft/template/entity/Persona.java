package com.ZBSoft.template.entity;

import java.io.Serializable;


public class Persona implements Serializable {

	private static final long serialVersionUID = 3647233284813657927L;
	
	private String id_contact; 
	private String name;
	private String email;
	private String phone;
	
	public Persona() {}
	
	public String getId_contact() {
		return id_contact;
	}



	public void setId_contact(String id_contact) {
		this.id_contact = id_contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Persona [id_contact=" + id_contact + ", name=" + name + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
	
	
}
