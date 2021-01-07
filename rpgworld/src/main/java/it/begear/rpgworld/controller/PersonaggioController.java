package it.begear.rpgworld.controller;

import java.util.List;
import java.util.Random;

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
		personaggioService.save(personaggioService.modificaPersonaggio(personaggio));
		return "redirect:/";
	}
	@RequestMapping(value ="/savep", method = RequestMethod.POST)
	public String savePersonaggiop(@ModelAttribute("personaggio1") Personaggio  personaggio) {
		personaggio.setEsperienza(personaggio.getEsperienza()+100);
		personaggio.setPuntivita(personaggio.getPuntivitamax());
		personaggioService.save(personaggio);
		return "redirect:/";
	}
	@RequestMapping(value ="/saven", method = RequestMethod.POST)
	public String savePersonaggion(@ModelAttribute("personaggio2") Personaggio  personaggio) {
		personaggio.setEsperienza(personaggio.getEsperienza()+100);
		personaggio.setPuntivita(personaggio.getPuntivitamax());
		personaggioService.save(personaggio);
		return "redirect:/";
	}
	@RequestMapping("/delete/{id}")
	public String deletePersonaggio(@PathVariable(name ="id")int id)
	{

		personaggioService.delete(id);
		return "redirect:/";
		
	}
	@RequestMapping("/scelta")
	public String takepg(Model model, @Param("keyword") String keyword) {
		List<Personaggio> personaggi= personaggioService.listAll(keyword);
		model.addAttribute("listapersonaggio", personaggi);
		model.addAttribute("keyword",keyword);
		return"lista_personaggi2";
	}
	@RequestMapping("/battaglia/{id}")
	public String Battaglia(@PathVariable(name = "id")int id,Model model) {
		Personaggio p1 = personaggioService.get(id);
		Personaggio p2 = personaggioService.get(valorerandom(id, personaggioService.massimoId()));
		model.addAttribute("personaggio1", p1);
		model.addAttribute("personaggio2", p2);
		
		return "battaglia";
}
	private int valorerandom(int ex,int max) {
		Random random = new Random();
		int val;
		do {
			do {
		val = random.nextInt(max);
			}while(personaggioService.checkid(val)==0);
		System.out.println(val);
		} while(ex==val);
		return val;
	}
}
