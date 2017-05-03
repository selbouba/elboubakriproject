package com.app.controleur;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Pole;

import com.app.service.MetierPole;

@RestController
public class ControleurPole {
	
	private MetierPole metier = new MetierPole();
	
	 
	
	
@RequestMapping(value="/PUBLIC/poles",method=RequestMethod.POST)
public void add(@RequestBody Pole M) {
		metier.add(M);
		
	}
@RequestMapping(value="/PUBLIC/poles",method=RequestMethod.PUT)
	public void upd(@RequestBody Pole M) {
		metier.upd(M);
	}
@RequestMapping(value="/PUBLIC/poles",method=RequestMethod.DELETE)
	public void del(@RequestBody Pole M) {
		metier.del(M);
	}
@RequestMapping(value="/PUBLIC/poles",method=RequestMethod.GET)
	public List<Pole> getList() {
		return metier.getList();
	}
	

	
}
