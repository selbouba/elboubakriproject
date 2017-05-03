package com.app.controleur;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Demande;
import com.app.model.User;
import com.app.service.MetierDemande;
import com.app.service.MetierUser;

@RestController
public class ControleurDemande {
	private MetierDemande metier = new MetierDemande();

	@RequestMapping(value="/PUBLIC/demandes",method=RequestMethod.POST)
	public void add(@RequestBody Demande M) {
			 metier.add(M);
			
		}
	@RequestMapping(value="/PUBLIC/demandes",method=RequestMethod.PUT)
		public void upd(@RequestBody Demande M) {
			metier.upd(M);
		}
	@RequestMapping(value="/PUBLIC/demandes",method=RequestMethod.DELETE)
		public void del(@RequestBody Demande M) {
			metier.del(M);
		}
	@RequestMapping(value="/PUBLIC/demandes",method=RequestMethod.GET)
		public List<Demande> getList() {
			return metier.getList();
		}
		
			

}
