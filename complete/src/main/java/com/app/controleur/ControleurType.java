package com.app.controleur;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Type;

import com.app.service.MetierType;
@RestController
public class ControleurType {
	
	private MetierType metier = new MetierType();

	@RequestMapping(value="/PUBLIC/types",method=RequestMethod.POST)
	public void add(@RequestBody Type M) {
			 metier.add(M);
			
		}
	@RequestMapping(value="/PUBLIC/types",method=RequestMethod.PUT)
		public void upd(@RequestBody Type M) {
			metier.upd(M);
		}
	@RequestMapping(value="/PUBLIC/types",method=RequestMethod.DELETE)
		public void del(@RequestBody Type M) {
			metier.del(M);
		}
	@RequestMapping(value="/PUBLIC/types",method=RequestMethod.GET)
		public List<Type> getList() {
			return metier.getList();
		}
		
			


}

