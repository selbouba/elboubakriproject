package com.app.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("admin")
public class Admin extends User{
	
	private String nom_remplacant;

	
	 

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

public Admin(int id_user, String email, String name, String lastName, Date date_embauche, int solde, int niveau,
			String nom_remplacant) {
		super(id_user, email, name, lastName, date_embauche, solde, niveau);
		this.nom_remplacant = nom_remplacant;
	}







	public String getNom_remplacant() {
		return nom_remplacant;
	}

	public void setNom_remplacant(String nom_remplacant) {
		this.nom_remplacant = nom_remplacant;
	}
	
	
	
	
	

}
