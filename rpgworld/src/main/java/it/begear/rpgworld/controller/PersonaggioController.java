package it.begear.rpgworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.begear.rpgworld.entity.Personaggio;
import it.begear.rpgworld.service.PersonaggioService;

@Controller
public class PersonaggioController {

	@Autowired
	private PersonaggioService personaggioService;
	@RequestMapping("/")
	public String viewHomePage() {
		
		return "index";
	}
	@RequestMapping("/new")
	public String  showNewPersonaggio(Model model) {
		Personaggio personaggio= new Personaggio();
		model.addAttribute("personaggio", personaggio);
		return "nuovo_personaggio";
	}
	@RequestMapping(value ="/save", method = RequestMethod.POST)
	public String savePersonaggio(@ModelAttribute("personaggio") Personaggio  personaggio) {
		personaggioService.save(personaggio);
		return "redirect:/";
	}

}
