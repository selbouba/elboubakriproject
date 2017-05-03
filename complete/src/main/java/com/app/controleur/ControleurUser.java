package com.app.controleur;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.iservice.iUser;
import com.app.model.User;
import com.app.service.MetierUser;

@RestController
public class ControleurUser {
	
private MetierUser metier = new MetierUser();
	
	
@CrossOrigin(origins = "http://localhost:80")
@RequestMapping(value="/PUBLIC/users",method=RequestMethod.POST)
public void add(@RequestBody User M) {
		metier.add(M);
		
	}
@RequestMapping(value="/PUBLIC/users",method=RequestMethod.PUT)
	public void upd(@RequestBody User M) {
		metier.upd(M);
	}
@RequestMapping(value="/PUBLIC/users",method=RequestMethod.DELETE)
	public void del(@RequestBody User M) {
		metier.del(M);
	}
@CrossOrigin(origins = "http://localhost:80/PUBLIC/users")
@RequestMapping(value="/PUBLIC/users",method=RequestMethod.GET)
	public List<User> getList() {
		return metier.getList();
	}
	
		
}
