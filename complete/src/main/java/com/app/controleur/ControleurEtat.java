package com.app.controleur;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Etat;

import com.app.service.MetierEtat;
@RestController
public class ControleurEtat {
	
	private MetierEtat metier = new MetierEtat();

	@RequestMapping(value="/PUBLIC/etats",method=RequestMethod.POST)
	public void add(@RequestBody Etat M) {
			 metier.add(M);
			
		}
	@RequestMapping(value="/PUBLIC/etats",method=RequestMethod.PUT)
		public void upd(@RequestBody Etat M) {
			metier.upd(M);
		}
	@RequestMapping(value="/PUBLIC/etats",method=RequestMethod.DELETE)
		public void del(@RequestBody Etat M) {
			metier.del(M);
		}
	@RequestMapping(value="/PUBLIC/etats",method=RequestMethod.GET)
		public List<Etat> getList() {
			return metier.getList();
		}
		
			


}
