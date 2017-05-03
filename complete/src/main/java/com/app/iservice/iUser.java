package com.app.iservice;

import java.util.List;

import com.app.model.User;

public interface iUser {
	
	 void add(User M);
     void upd(User M);
     void del(User M);
     List<User> getList();
	

}
