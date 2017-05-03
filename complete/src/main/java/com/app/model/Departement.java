package com.app.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;



@Entity
public class Departement implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_DEPARTEMENT")
	private int id_departement;
	@Column(name="NOM_DEPARTEMENT")
	private String nom_departement;
	@OneToMany
    private Set<User> user;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="ID_POLE")
	private Pole pole;
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departement(String nom_departement) {
		super();
		this.nom_departement = nom_departement;
	}
	
	public int getId_departement() {
		return id_departement;
	}
	public void setId_departement(int id_departement) {
		this.id_departement = id_departement;
	}
	public String getNom_departement() {
		return nom_departement;
	}
	public void setNom_departement(String nom_departement) {
		this.nom_departement = nom_departement;
	}
	@JsonIgnore
	public Set<User> getUser() {
		return user;
	}
	public void setUser(Set<User> user) {
		this.user = user;
	}
	public Pole getPole() {
		return pole;
	}
	public void setPole(Pole pole) {
		this.pole = pole;
	}
	
	

}
