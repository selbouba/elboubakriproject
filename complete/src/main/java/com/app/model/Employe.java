package com.app.model;

import java.util.Date;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity   
@DiscriminatorValue("employe")

public class Employe extends User{
	
private String nom_responsable;

public Employe() {
	super();
	// TODO Auto-generated constructor stub
}



public Employe(int id_user, String email, String name, String lastName, Date date_embauche, int solde, int niveau,
		String nom_responsable) {
	super(id_user, email, name, lastName, date_embauche, solde, niveau);
	this.nom_responsable = nom_responsable;
}



public String getNom_responsable() {
	return nom_responsable;
}

public void setNom_responsable(String nom_responsable) {
	this.nom_responsable = nom_responsable;
}


	

}
