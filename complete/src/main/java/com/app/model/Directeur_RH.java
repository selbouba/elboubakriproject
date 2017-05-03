package com.app.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("directeur")




public class Directeur_RH extends User{

	public Directeur_RH() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Directeur_RH(int id_user, String email, String name, String lastName, Date date_embauche, int solde,
			int niveau) {
		super(id_user, email, name, lastName, date_embauche, solde, niveau);
		// TODO Auto-generated constructor stub
	}

	
	
	

}
