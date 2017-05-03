package com.app.iservice;
import java.util.List;

import com.app.model.Departement;

public interface iDepartement {
	
	

	

	
	     void add(Departement M);
	     void upd(Departement M);
	     void del(Departement M);
	    List<Departement> getList();
	    
	

}
