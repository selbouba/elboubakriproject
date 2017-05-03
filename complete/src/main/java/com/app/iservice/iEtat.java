package com.app.iservice;

import java.util.List;

import com.app.model.Etat;


public interface iEtat {
	
	public void add(Etat M); 
    public void upd(Etat M);
    public void del(Etat M);
	public List<Etat> getList(); 

}
