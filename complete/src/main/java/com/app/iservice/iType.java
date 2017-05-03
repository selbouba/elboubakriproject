package com.app.iservice;

import java.util.List;

import com.app.model.Etat;
import com.app.model.Type;

public interface iType {
	
	public void add(Type M); 
    public void upd(Type M);
    public void del(Type M);
	public List<Type> getList(); 


}
