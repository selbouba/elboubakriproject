package com.app.model;


import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;




@Inheritance(strategy=InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn(name="FONCTION",discriminatorType=DiscriminatorType.STRING,length=15)
@Entity
@Table(name="TUSER")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="FONCTION")
@JsonSubTypes({
	@Type(name="admin" ,value=Admin.class),
	@Type(name="employe" ,value=Employe.class),
	@Type(name="directeur" ,value=Directeur_RH.class),
	@Type(name="responsable" ,value=Responsable.class),
})
public class User implements Serializable{
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_USER")
	private int id_user;
	@Column(name="EMAIL")
	private String email;
	@Column(name="NAME")
	private String name;
	@Column(name="LASTNAME")
	private String lastName;
	@Column(name="DATE_EMBAUCHE")
    private Date date_embauche;
	@Column(name="SOLDE")
    private int solde;
	@Column(name="NIVEAU")
    private int niveau;
	
	
	
    @ManyToOne(cascade = {CascadeType.ALL})
    
    private Departement departement;
    @OneToMany
    private Set<Demande> demande;
    

	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id_user, String email, String name, String lastName, Date date_embauche, int solde, int niveau) {
		super();
		this.id_user = id_user;
		this.email = email;
		this.name = name;
		this.lastName = lastName;
		this.date_embauche = date_embauche;
		this.solde = solde;
		this.niveau = niveau;
	}


	public int getId_user() {
		return id_user;
	}


	public void setId_user(int id_user) {
		this.id_user = id_user;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDate_embauche() {
		return date_embauche;
	}


	public void setDate_embauche(Date date_embauche) {
		this.date_embauche = date_embauche;
	}


	public int getSolde() {
		return solde;
	}


	public void setSolde(int solde) {
		this.solde = solde;
	}


	public int getNiveau() {
		return niveau;
	}


	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}


	public Departement getDepartement() {
		return departement;
	}


	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

@JsonIgnore
	public Set<Demande> getDemande() {
		return demande;
	}


	public void setDemande(Set<Demande> demande) {
		this.demande = demande;
	}
	
	


	}