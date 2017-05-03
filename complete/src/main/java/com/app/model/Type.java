package com.app.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Type implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_TYPE")
	private long id_type;
	@Column(name="TYPE")
	private String type;
	
	@OneToMany
    private Set<Demande> demande;
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Type(String type) {
		super();
		this.type = type;
	}
	
	
	public long getId_type() {
		return id_type;
	}
	public void setId_type(long id_type) {
		this.id_type = id_type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@JsonIgnore
	public Set<Demande> getDemande() {
		return demande;
	}
	public void setDemande(Set<Demande> demande) {
		this.demande = demande;
	}
	
	
	

}
