package com.app.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="ETAT")
public class Etat implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_ETAT")
	 private long id_etat;
	@Column(name="ETAT")
	 private String etat;
	@Column(name="DATE_ETAT")
	 private Date date_etat;
	@OneToMany
    private Set<Demande> demande;
	public Etat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etat(int id_etat, String etat, Date date_etat) {
		super();
		this.id_etat = id_etat;
		this.etat = etat;
		this.date_etat = date_etat;
	}
	
	public long getId_etat() {
		return id_etat;
	}
	public void setId_etat(long id_etat) {
		this.id_etat = id_etat;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Date getDate_etat() {
		return date_etat;
	}
	public void setDate_etat(Date date_etat) {
		this.date_etat = date_etat;
	}
	@JsonIgnore
	public Set<Demande> getDemande() {
		return demande;
	}
	public void setDemande(Set<Demande> demande) {
		this.demande = demande;
	}
	
	
	
	
	
	
	
	
	
	
	
	



}
