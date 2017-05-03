package com.app.iservice;

import java.util.List;
import com.app.model.Demande;


public interface iDemande {
	
	public void add(Demande M); 
    public void upd(Demande M);
    public void del(Demande M);
	public List<Demande> getList(); 
	


}
