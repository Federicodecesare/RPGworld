package it.begear.rpgworld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import it.begear.rpgworld.entity.Personaggio;
import it.begear.rpgworld.service.PersonaggioService;
import it.begear.rpgworld.utils.Metodivari;

@Controller
public class PersonaggioController {

	@Autowired
	private PersonaggioService personaggioService;
	@RequestMapping("/")
	public String viewHomePage() {
		
		return "index";
	}
	@RequestMapping("/lista")
	public String showListPersonaggi(Model model, @Param("keyword") String keyword) {
		List<Personaggio> personaggi= personaggioService.listAll(keyword);
		model.addAttribute("listapersonaggio", personaggi);
		model.addAttribute("keyword",keyword);
		return"lista_personaggi";
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
	@RequestMapping("/delete/{id}")
	public String deletePersonaggio(@PathVariable(name ="id")int id)
	{

		personaggioService.delete(id);
		return "redirect:/";
		
	}
	@RequestMapping("/battaglia/{id}")
	public String Battaglia(@PathVariable(name = "id")int id,Model model) {
		Personaggio p1 = personaggioService.get(id);
		Personaggio p2 = personaggioService.get(Metodivari.valorerandom(id, personaggioService.massimoId()));
		model.addAttribute("personaggio1", p1);
		model.addAttribute("personaggio1", p2);
		boolean a1=false,a2=false;
		String choose=(String) model.getAttribute("scelta");
		do {
			model.addAttribute("personaggio1", p1);
			model.addAttribute("personaggio1", p2);	
		if(choose.equalsIgnoreCase("attacco")) {
			p2.setPuntivita(Metodivari.danno(p1, p2,a2));
			a2=false;
			personaggioService.save(p2);
		}else if(choose.equalsIgnoreCase("difesa")) {
			a1=true;
		}
		int sceltara= Metodivari.sceltarandom();
		if(sceltara==0) {
			p1.setPuntivita(Metodivari.danno(p1, p2,a1));
			a1=false;
			personaggioService.save(p1);
		}else if(sceltara==1) {
			a2=true;
		}
		}while(p1.getPuntivita()!=0 && p2.getPuntivita()!=0); 
		return "esito";
}
}
