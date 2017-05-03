package com.app.controleur;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Departement;
import com.app.model.Pole;
import com.app.service.MetierDepartement;
import com.app.service.MetierPole;

@RestController
public class ControleurDepartement {
	
	private MetierDepartement metier = new MetierDepartement();
	
	 
	
	
	@RequestMapping(value="/PUBLIC/departements",method=RequestMethod.POST)
	public void add(@RequestBody Departement M) {
			metier.add(M);
			
		}
	@RequestMapping(value="/PUBLIC/departements",method=RequestMethod.PUT)
		public void upd(@RequestBody Departement M) {
			metier.upd(M);
		}
	@RequestMapping(value="/PUBLIC/departements",method=RequestMethod.DELETE)
		public void del(@RequestBody Departement M) {
			metier.del(M);
		}
	@RequestMapping(value="/PUBLIC/departements",method=RequestMethod.GET)
		public List<Departement> getList() {
			return metier.getList();
		}
		

		
	
	
	

}
