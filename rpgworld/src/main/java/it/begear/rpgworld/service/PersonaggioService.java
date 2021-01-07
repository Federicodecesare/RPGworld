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
	
	public int massimoId() {
		return rep.massimoId();
	}
	public void save(Personaggio personaggio) {
		// controlli logici e applicativi

		rep.save(personaggio);
	}

	public Personaggio get(Integer id) {

		return rep.findById(id).get();
	}

	
	public int checkid(int id) {
		return rep.checkid(id);
	}
	public void delete(Integer id) {
		rep.deleteById(id);
	}
	public Personaggio modificaPersonaggio(Personaggio personaggio) {
		switch (personaggio.getClasse().toLowerCase()) {
		case "guerriero":
			personaggio.setLivello(1);
			personaggio.setAttacco(30);
			personaggio.setPuntivita(100);
			personaggio.setPuntivitamax(100);
			personaggio.setDifesa(20);
			
			
			break;

		case "mago":
			personaggio.setLivello(1);
			personaggio.setAttacco(30);
			personaggio.setPuntivita(100);
			personaggio.setPuntivitamax(100);
			personaggio.setDifesa(20);
			
			break;
		case "stregone":
			personaggio.setLivello(1);
			personaggio.setAttacco(30);
			personaggio.setPuntivita(100);
			personaggio.setPuntivitamax(100);
			personaggio.setDifesa(20);
			
			break;
		case "paladino":
			personaggio.setLivello(1);
			personaggio.setAttacco(60);
			personaggio.setPuntivita(100);
			personaggio.setPuntivitamax(100);
			personaggio.setDifesa(20);
			
			break;
		case "ladro":
			personaggio.setLivello(1);
			personaggio.setAttacco(30);
			personaggio.setPuntivita(100);
			personaggio.setPuntivitamax(100);
			personaggio.setDifesa(20);
			break;
		}
		
		return personaggio;
	}
	
	
	public Personaggio livelloPersonaggi(Personaggio personaggio) {

		switch (personaggio.getClasse()) {
		case "guerriero":
			if (personaggio.getEsperienza() >= 200 && personaggio.getLivello()==1) {
				personaggio.setLivello(2);
			}
			if (personaggio.getEsperienza() >= 400 && personaggio.getLivello()==2) {
				personaggio.setLivello(3);
			}
			if (personaggio.getEsperienza() >= 700 && personaggio.getLivello()==3) {
				personaggio.setLivello(4);
			}
			if (personaggio.getEsperienza() >= 1000 && personaggio.getLivello()==4) {
				personaggio.setLivello(5);
			}
			if (personaggio.getEsperienza() >= 1500 && personaggio.getLivello()==5) {
				personaggio.setLivello(6);
			}
			if (personaggio.getEsperienza() >= 2000 && personaggio.getLivello()==6) {
				personaggio.setLivello(7);
			}
			if (personaggio.getEsperienza() >= 2500 && personaggio.getLivello()==7) {
				personaggio.setLivello(8);
			}
			if (personaggio.getEsperienza() >= 3000 && personaggio.getLivello()==8) {
				personaggio.setLivello(9);
			}
				
				if (personaggio.getEsperienza() >= 3500 && personaggio.getLivello()==9) {
					personaggio.setLivello(10);
			}
	
			
			
			break;

		case "mago":
			if (personaggio.getEsperienza() >= 200 && personaggio.getLivello()==1) {
				personaggio.setLivello(2);
			}
			if (personaggio.getEsperienza() >= 400 && personaggio.getLivello()==2) {
				personaggio.setLivello(3);
			}
			if (personaggio.getEsperienza() >= 700 && personaggio.getLivello()==3) {
				personaggio.setLivello(4);
			}
			if (personaggio.getEsperienza() >= 1000 && personaggio.getLivello()==4) {
				personaggio.setLivello(5);
			}
			if (personaggio.getEsperienza() >= 1500 && personaggio.getLivello()==5) {
				personaggio.setLivello(6);
			}
			if (personaggio.getEsperienza() >= 2000 && personaggio.getLivello()==6) {
				personaggio.setLivello(7);
			}
			if (personaggio.getEsperienza() >= 2500 && personaggio.getLivello()==7) {
				personaggio.setLivello(8);
			}
			if (personaggio.getEsperienza() >= 3000 && personaggio.getLivello()==8) {
				personaggio.setLivello(9);
			}
				
				if (personaggio.getEsperienza() >= 3500 && personaggio.getLivello()==9) {
					personaggio.setLivello(10);
			}
		case "stregone":
			if (personaggio.getEsperienza() >= 200 && personaggio.getLivello()==1) {
				personaggio.setLivello(2);
			}
			if (personaggio.getEsperienza() >= 400 && personaggio.getLivello()==2) {
				personaggio.setLivello(3);
			}
			if (personaggio.getEsperienza() >= 700 && personaggio.getLivello()==3) {
				personaggio.setLivello(4);
			}
			if (personaggio.getEsperienza() >= 1000 && personaggio.getLivello()==4) {
				personaggio.setLivello(5);
			}
			if (personaggio.getEsperienza() >= 1500 && personaggio.getLivello()==5) {
				personaggio.setLivello(6);
			}
			if (personaggio.getEsperienza() >= 2000 && personaggio.getLivello()==6) {
				personaggio.setLivello(7);
			}
			if (personaggio.getEsperienza() >= 2500 && personaggio.getLivello()==7) {
				personaggio.setLivello(8);
			}
			if (personaggio.getEsperienza() >= 3000 && personaggio.getLivello()==8) {
				personaggio.setLivello(9);
			}
				
				if (personaggio.getEsperienza() >= 3500 && personaggio.getLivello()==9) {
					personaggio.setLivello(10);
			}
		case "paladino":
			if (personaggio.getEsperienza() >= 200 && personaggio.getLivello()==1) {
				personaggio.setLivello(2);
			}
			if (personaggio.getEsperienza() >= 400 && personaggio.getLivello()==2) {
				personaggio.setLivello(3);
			}
			if (personaggio.getEsperienza() >= 700 && personaggio.getLivello()==3) {
				personaggio.setLivello(4);
			}
			if (personaggio.getEsperienza() >= 1000 && personaggio.getLivello()==4) {
				personaggio.setLivello(5);
			}
			if (personaggio.getEsperienza() >= 1500 && personaggio.getLivello()==5) {
				personaggio.setLivello(6);
			}
			if (personaggio.getEsperienza() >= 2000 && personaggio.getLivello()==6) {
				personaggio.setLivello(7);
			}
			if (personaggio.getEsperienza() >= 2500 && personaggio.getLivello()==7) {
				personaggio.setLivello(8);
			}
			if (personaggio.getEsperienza() >= 3000 && personaggio.getLivello()==8) {
				personaggio.setLivello(9);
			}
				
				if (personaggio.getEsperienza() >= 3500 && personaggio.getLivello()==9) {
					personaggio.setLivello(10);
			}
		case "ladro":
			if (personaggio.getEsperienza() >= 200 && personaggio.getLivello()==1) {
				personaggio.setLivello(2);
			}
			if (personaggio.getEsperienza() >= 400 && personaggio.getLivello()==2) {
				personaggio.setLivello(3);
			}
			if (personaggio.getEsperienza() >= 700 && personaggio.getLivello()==3) {
				personaggio.setLivello(4);
			}
			if (personaggio.getEsperienza() >= 1000 && personaggio.getLivello()==4) {
				personaggio.setLivello(5);
			}
			if (personaggio.getEsperienza() >= 1500 && personaggio.getLivello()==5) {
				personaggio.setLivello(6);
			}
			if (personaggio.getEsperienza() >= 2000 && personaggio.getLivello()==6) {
				personaggio.setLivello(7);
			}
			if (personaggio.getEsperienza() >= 2500 && personaggio.getLivello()==7) {
				personaggio.setLivello(8);
			}
			if (personaggio.getEsperienza() >= 3000 && personaggio.getLivello()==8) {
				personaggio.setLivello(9);
			}
				
				if (personaggio.getEsperienza() >= 3500 && personaggio.getLivello()==9) {
					personaggio.setLivello(10);
			}
	
		}
		personaggio.setEsperienza(0);
	
		return personaggio;
	}
}