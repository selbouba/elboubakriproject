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

public class Pole implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_POLE")
	private int id_pole;
	@Column(name="NOM_POLE")
	private String nom_pole;
	@OneToMany
    private Set<Departement> departement;
	public Pole() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pole(String nom_pole) {
		super();
		this.nom_pole = nom_pole;
	}
	
	public int getId_pole() {
		return id_pole;
	}
	public void setId_pole(int id_pole) {
		this.id_pole = id_pole;
	}
	public String getNom_pole() {
		return nom_pole;
	}
	public void setNom_pole(String nom_pole) {
		this.nom_pole = nom_pole;
	}
	@JsonIgnore
	public Set<Departement> getDepartement() {
		return departement;
	}
	public void setDepartement(Set<Departement> departement) {
		this.departement = departement;
	}
	
	

}
