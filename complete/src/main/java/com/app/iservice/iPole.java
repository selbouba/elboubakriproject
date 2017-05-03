package com.app.iservice;

import java.util.List;


import com.app.model.Pole;

public interface iPole {
	
    public void add(Pole M); 
    public void upd(Pole M);
    public void del(Pole M);
	public List<Pole> getList(); 
	
	

}
