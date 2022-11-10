package fr.imt.webannuaire;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		
	//	TODO : trouver comment faire sans RESTController

public class WebannuaireController {

	@Autowired
	WebannuaireInterface wi;
	
	
	@GetMapping ("/annuaire")
	public Collection<Person> getAll() {
			return wi.getAll();
				}



}
