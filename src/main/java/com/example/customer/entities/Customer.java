package com.example.customer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id ;
private String name ; 
private String adresse ;
private long phone;
@ManyToOne
private Categorie categorie;
public Customer() {
	super();
}

public Customer(String name, String adresse, long phone) {
	super();
	this.name = name;
	this.adresse = adresse;
	this.phone = phone;
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}





@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", adresse=" + adresse + ", phone=" + phone + "]";
}




}
