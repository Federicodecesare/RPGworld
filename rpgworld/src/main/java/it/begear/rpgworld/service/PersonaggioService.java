package it.begear.rpgworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.begear.rpgworld.entity.Personaggio;
import it.begear.rpgworld.repository.PersonaggioRepository;
@Service
public class PersonaggioService {

	@Autowired
	private PersonaggioRepository rep;

	public List<Personaggio> listAll(String keyword) {
		if (keyword != null) {
			return rep.search(keyword);
		}
		return rep.findAll();
	}

	public Personaggio ModifcaPersonaggio(Personaggio personaggio) {
		personaggio.getClasse();
		
		switch (personaggio.getClasse())  { 
		case "guerriero"  : 
		  String a= personaggio.getClasse();
			
			personaggio.setAttacco(15);
			personaggio.setDifesa(10);
			personaggio.setPuntivita(100);
			personaggio.setPuntivitamax(100);
			break;
		case "mago": 
			String b= personaggio.getClasse();
			personaggio.setAttacco(25);
			personaggio.setDifesa(5);
			personaggio.setPuntivita(90);
			personaggio.setPuntivitamax(90);
			
			break;
		case "stregone": 
			String c= personaggio.getClasse();
			personaggio.setAttacco(25);
			personaggio.setDifesa(10);
			personaggio.setPuntivita(95);
			personaggio.setPuntivitamax(95);
			break;
		case "paladino": 
			String d= personaggio.getClasse();
			personaggio.setAttacco(20);
			personaggio.setDifesa(15);
			personaggio.setPuntivita(105);
			personaggio.setPuntivitamax(105);
			break;
		case "ladro": 
			String e= personaggio.getClasse();
			personaggio.setAttacco(30);
			personaggio.setDifesa(5);
			personaggio.setPuntivita(80);
			personaggio.setPuntivitamax(80);
			break;
			
		}
		
		return personaggio;}
	
	/**
	 * @param personaggio
	 * @return
	 */
	public Personaggio LevelPersonaggio(Personaggio personaggio) {
		personaggio.getClasse();
		
		switch (personaggio.getClasse())  { 
		case "guerriero"  : 
		  String a= personaggio.getClasse();
			personaggio.setEsperienza(0);
			personaggio.setLivello(1);
			
			if (personaggio.getEsperienza() >200 )
				if( personaggio.getLivello(1)) {
				personaggio.setLivello(2);
			}
			if (personaggio.getEsperienza() >500) {
				personaggio.setLivello(2);
			}
			if (personaggio.getEsperienza() >900) {
				personaggio.setLivello(3);
			}
			if (personaggio.getEsperienza() >1500) {
				personaggio.setLivello(4);
			}
			if (personaggio.getEsperienza() >2000) {
				personaggio.setLivello(5);
			}if (personaggio.getEsperienza() >2500) {
				personaggio.setLivello(6);
			}if (personaggio.getEsperienza() >3000) {
				personaggio.setLivello(7);
			}if (personaggio.getEsperienza() >3500) {
				personaggio.setLivello(8);
			}if (personaggio.getEsperienza() >4000) {
				personaggio.setLivello(9);
			}if (personaggio.getEsperienza() >4500) {
				personaggio.setLivello(10);
			}
			
			
			break;
		case "mago": 
			String b= personaggio.getClasse();
			
			break;
		case "stregone": 
			String c= personaggio.getClasse();
			if (personaggio.getEsperienza() >200) {
				personaggio.setLivello(1);
			}
			if (personaggio.getEsperienza() >500) {
				personaggio.setLivello(2);
			}
			if (personaggio.getEsperienza() >900) {
				personaggio.setLivello(3);
			}
			if (personaggio.getEsperienza() >1500) {
				personaggio.setLivello(4);
			}
			if (personaggio.getEsperienza() >2000) {
				personaggio.setLivello(5);
			}if (personaggio.getEsperienza() >2500) {
				personaggio.setLivello(6);
			}if (personaggio.getEsperienza() >3000) {
				personaggio.setLivello(7);
			}if (personaggio.getEsperienza() >3500) {
				personaggio.setLivello(8);
			}if (personaggio.getEsperienza() >4000) {
				personaggio.setLivello(9);
			}if (personaggio.getEsperienza() >4500) {
				personaggio.setLivello(10);
			}
			
			
			
			break;
		case "paladino": 
			String d= personaggio.getClasse();
		
			if (personaggio.getEsperienza() >200) {
				personaggio.setLivello(1);
			}
			if (personaggio.getEsperienza() >500) {
				personaggio.setLivello(2);
			}
			if (personaggio.getEsperienza() >900) {
				personaggio.setLivello(3);
			}
			if (personaggio.getEsperienza() >1500) {
				personaggio.setLivello(4);
			}
			if (personaggio.getEsperienza() >2000) {
				personaggio.setLivello(5);
			}if (personaggio.getEsperienza() >2500) {
				personaggio.setLivello(6);
			}if (personaggio.getEsperienza() >3000) {
				personaggio.setLivello(7);
			}if (personaggio.getEsperienza() >3500) {
				personaggio.setLivello(8);
			}if (personaggio.getEsperienza() >4000) {
				personaggio.setLivello(9);
			}if (personaggio.getEsperienza() >4500) {
				personaggio.setLivello(10);
			}
			
			
			break;
		case "ladro": 
			String e= personaggio.getClasse();
			
			if (personaggio.getEsperienza() >200) {
				personaggio.setLivello(1);
			}
			if (personaggio.getEsperienza() >500) {
				personaggio.setLivello(2);
			}
			if (personaggio.getEsperienza() >900) {
				personaggio.setLivello(3);
			}
			if (personaggio.getEsperienza() >1500) {
				personaggio.setLivello(4);
			}
			if (personaggio.getEsperienza() >2000) {
				personaggio.setLivello(5);
			}if (personaggio.getEsperienza() >2500) {
				personaggio.setLivello(6);
			}if (personaggio.getEsperienza() >3000) {
				personaggio.setLivello(7);
			}if (personaggio.getEsperienza() >3500) {
				personaggio.setLivello(8);
			}if (personaggio.getEsperienza() >4000) {
				personaggio.setLivello(9);
			}if (personaggio.getEsperienza() >4500) {
				personaggio.setLivello(10);
			}
			
			
			break;
			
		}
		
		return personaggio;}

	public void save(Personaggio personaggio) {
		// controlli logici e applicativi

		rep.save(personaggio);
	}

	public Personaggio get(Integer id) {

		return rep.findById(id).get();
	}

	public void delete(Integer id) {
		rep.deleteById(id);
	}
}