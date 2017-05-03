package com.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Demande implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_DEMANDE")
	private int id;
	@Column(name="DATE_DEBUT")
	private Date date_debut;
	@Column(name="DATE_FIN")
	private Date date_fin;
	@Column(name="COMMENTAIRE")
	private String commentaire;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="ID_USER")
	private User user;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="ID_TYPE")
	private Type type;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="ID_ETAT")
	private Etat etat;
	
	public Demande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demande(Date date_debut, Date date_fin, String commentaire) {
		super();
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.commentaire = commentaire;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
