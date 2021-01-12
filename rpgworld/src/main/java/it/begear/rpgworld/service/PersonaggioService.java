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
			personaggio.setAttacco((int) (Math.random() * 300));
			personaggio.setPuntivita((int) (Math.random() * 400));
			personaggio.setPuntivitamax((int) (Math.random() * 400));
			personaggio.setDifesa((int) (Math.random() * 100));

			break;

		case "mago":
			personaggio.setLivello(1);
			personaggio.setAttacco((int) (Math.random() * 200));
			personaggio.setPuntivita((int) (Math.random() * 300));
			personaggio.setPuntivitamax((int) (Math.random() * 300));
			personaggio.setDifesa((int) (Math.random() * 200));

			break;
		case "stregone":
			personaggio.setLivello(1);
			personaggio.setAttacco((int) (Math.random() * 100));
			personaggio.setPuntivita((int) (Math.random() * 300));
			personaggio.setPuntivitamax((int) (Math.random() * 300));
			personaggio.setDifesa((int) (Math.random() * 100));

			break;
		case "paladino":
			personaggio.setLivello(1);
			personaggio.setAttacco((int) (Math.random() * 300));
			personaggio.setPuntivita((int) (Math.random() * 300));
			personaggio.setPuntivitamax((int) (Math.random() * 300));
			personaggio.setDifesa((int) (Math.random() * 300));

			break;
		case "ladro":
			personaggio.setLivello(1);
			personaggio.setAttacco((int) (Math.random() * 200));
			personaggio.setPuntivita((int) (Math.random() * 200));
			personaggio.setPuntivitamax((int) (Math.random() * 200));
			personaggio.setDifesa((int) (Math.random() * 200));
			break;
		}

		return personaggio;
	}

	public Personaggio livelloPersonaggi(Personaggio personaggio) {

		switch (personaggio.getClasse().toLowerCase()) {
		case "guerriero":
			if (personaggio.getEsperienza() >= 200 && personaggio.getLivello() == 1) {
				personaggio.setLivello(2);
				personaggio.setAttacco(personaggio.getAttacco() + 10);
				personaggio.setDifesa(personaggio.getDifesa() + 10);
				personaggio.setPuntivita(personaggio.getPuntivita() + 10);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 10);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 400 && personaggio.getLivello() == 2) {
				personaggio.setLivello(3);
				personaggio.setAttacco(personaggio.getAttacco() + 20);
				personaggio.setDifesa(personaggio.getDifesa() + 20);
				personaggio.setPuntivita(personaggio.getPuntivita() + 20);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 20);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 700 && personaggio.getLivello() == 3) {
				personaggio.setLivello(4);
				personaggio.setAttacco(personaggio.getAttacco() + 30);
				personaggio.setDifesa(personaggio.getDifesa() + 30);
				personaggio.setPuntivita(personaggio.getPuntivita() + 30);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 30);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 1000 && personaggio.getLivello() == 4) {
				personaggio.setLivello(5);
				personaggio.setAttacco(personaggio.getAttacco() + 40);
				personaggio.setDifesa(personaggio.getDifesa() + 40);
				personaggio.setPuntivita(personaggio.getPuntivita() + 40);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 40);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 1500 && personaggio.getLivello() == 5) {
				personaggio.setLivello(6);
				personaggio.setAttacco(personaggio.getAttacco() + 50);
				personaggio.setDifesa(personaggio.getDifesa() + 50);
				personaggio.setPuntivita(personaggio.getPuntivita() + 50);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 50);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 2000 && personaggio.getLivello() == 6) {
				personaggio.setLivello(7);
				personaggio.setAttacco(personaggio.getAttacco() + 60);
				personaggio.setDifesa(personaggio.getDifesa() + 60);
				personaggio.setPuntivita(personaggio.getPuntivita() + 60);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 60);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 2500 && personaggio.getLivello() == 7) {
				personaggio.setLivello(8);
				personaggio.setAttacco(personaggio.getAttacco() + 70);
				personaggio.setDifesa(personaggio.getDifesa() + 70);
				personaggio.setPuntivita(personaggio.getPuntivita() + 70);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 70);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 3000 && personaggio.getLivello() == 8) {
				personaggio.setLivello(9);
				personaggio.setAttacco(personaggio.getAttacco() + 80);
				personaggio.setDifesa(personaggio.getDifesa() + 80);
				personaggio.setPuntivita(personaggio.getPuntivita() + 80);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 80);

				personaggio.setEsperienza(0);
			}

			if (personaggio.getEsperienza() >= 3500 && personaggio.getLivello() == 9) {
				personaggio.setLivello(10);
				personaggio.setAttacco(personaggio.getAttacco() + 100);
				personaggio.setDifesa(personaggio.getDifesa() + 100);
				personaggio.setPuntivita(personaggio.getPuntivita() + 100);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 100);

				personaggio.setEsperienza(0);
			}

			break;

		case "mago":
			if (personaggio.getEsperienza() >= 200 && personaggio.getLivello() == 1) {
				personaggio.setLivello(2);
				personaggio.setAttacco(personaggio.getAttacco() + 10);
				personaggio.setDifesa(personaggio.getDifesa() + 10);
				personaggio.setPuntivita(personaggio.getPuntivita() + 10);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 10);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 400 && personaggio.getLivello() == 2) {
				personaggio.setLivello(3);
				personaggio.setAttacco(personaggio.getAttacco() + 20);
				personaggio.setDifesa(personaggio.getDifesa() + 20);
				personaggio.setPuntivita(personaggio.getPuntivita() + 20);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 20);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 700 && personaggio.getLivello() == 3) {
				personaggio.setLivello(4);
				personaggio.setAttacco(personaggio.getAttacco() + 30);
				personaggio.setDifesa(personaggio.getDifesa() + 30);
				personaggio.setPuntivita(personaggio.getPuntivita() + 30);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 30);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 1000 && personaggio.getLivello() == 4) {
				personaggio.setLivello(5);
				personaggio.setAttacco(personaggio.getAttacco() + 40);
				personaggio.setDifesa(personaggio.getDifesa() + 40);
				personaggio.setPuntivita(personaggio.getPuntivita() + 40);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 40);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 1500 && personaggio.getLivello() == 5) {
				personaggio.setLivello(6);
				personaggio.setAttacco(personaggio.getAttacco() + 50);
				personaggio.setDifesa(personaggio.getDifesa() + 50);
				personaggio.setPuntivita(personaggio.getPuntivita() + 50);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 50);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 2000 && personaggio.getLivello() == 6) {
				personaggio.setLivello(7);
				personaggio.setAttacco(personaggio.getAttacco() + 60);
				personaggio.setDifesa(personaggio.getDifesa() + 60);
				personaggio.setPuntivita(personaggio.getPuntivita() + 60);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 60);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 2500 && personaggio.getLivello() == 7) {
				personaggio.setLivello(8);
				personaggio.setAttacco(personaggio.getAttacco() + 70);
				personaggio.setDifesa(personaggio.getDifesa() + 70);
				personaggio.setPuntivita(personaggio.getPuntivita() + 70);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 70);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 3000 && personaggio.getLivello() == 8) {
				personaggio.setLivello(9);
				personaggio.setAttacco(personaggio.getAttacco() + 80);
				personaggio.setDifesa(personaggio.getDifesa() + 80);
				personaggio.setPuntivita(personaggio.getPuntivita() + 80);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 80);

				personaggio.setEsperienza(0);
			}

			if (personaggio.getEsperienza() >= 3500 && personaggio.getLivello() == 9) {
				personaggio.setLivello(10);
				personaggio.setAttacco(personaggio.getAttacco() + 100);
				personaggio.setDifesa(personaggio.getDifesa() + 100);
				personaggio.setPuntivita(personaggio.getPuntivita() + 100);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 100);

				personaggio.setEsperienza(0);
			}
		case "paladino":
			if (personaggio.getEsperienza() >= 200 && personaggio.getLivello() == 1) {
				personaggio.setLivello(2);
				personaggio.setAttacco(personaggio.getAttacco() + 10);
				personaggio.setDifesa(personaggio.getDifesa() + 10);
				personaggio.setPuntivita(personaggio.getPuntivita() + 10);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 10);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 400 && personaggio.getLivello() == 2) {
				personaggio.setLivello(3);
				personaggio.setAttacco(personaggio.getAttacco() + 20);
				personaggio.setDifesa(personaggio.getDifesa() + 20);
				personaggio.setPuntivita(personaggio.getPuntivita() + 20);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 20);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 700 && personaggio.getLivello() == 3) {
				personaggio.setLivello(4);
				personaggio.setAttacco(personaggio.getAttacco() + 30);
				personaggio.setDifesa(personaggio.getDifesa() + 30);
				personaggio.setPuntivita(personaggio.getPuntivita() + 30);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 30);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 1000 && personaggio.getLivello() == 4) {
				personaggio.setLivello(5);
				personaggio.setAttacco(personaggio.getAttacco() + 40);
				personaggio.setDifesa(personaggio.getDifesa() + 40);
				personaggio.setPuntivita(personaggio.getPuntivita() + 40);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 40);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 1500 && personaggio.getLivello() == 5) {
				personaggio.setLivello(6);
				personaggio.setAttacco(personaggio.getAttacco() + 50);
				personaggio.setDifesa(personaggio.getDifesa() + 50);
				personaggio.setPuntivita(personaggio.getPuntivita() + 50);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 50);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 2000 && personaggio.getLivello() == 6) {
				personaggio.setLivello(7);
				personaggio.setAttacco(personaggio.getAttacco() + 60);
				personaggio.setDifesa(personaggio.getDifesa() + 60);
				personaggio.setPuntivita(personaggio.getPuntivita() + 60);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 60);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 2500 && personaggio.getLivello() == 7) {
				personaggio.setLivello(8);
				personaggio.setAttacco(personaggio.getAttacco() + 70);
				personaggio.setDifesa(personaggio.getDifesa() + 70);
				personaggio.setPuntivita(personaggio.getPuntivita() + 70);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 70);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 3000 && personaggio.getLivello() == 8) {
				personaggio.setLivello(9);
				personaggio.setAttacco(personaggio.getAttacco() + 80);
				personaggio.setDifesa(personaggio.getDifesa() + 80);
				personaggio.setPuntivita(personaggio.getPuntivita() + 80);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 80);

				personaggio.setEsperienza(0);
			}

			if (personaggio.getEsperienza() >= 3500 && personaggio.getLivello() == 9) {
				personaggio.setLivello(10);
				personaggio.setAttacco(personaggio.getAttacco() + 100);
				personaggio.setDifesa(personaggio.getDifesa() + 100);
				personaggio.setPuntivita(personaggio.getPuntivita() + 100);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 100);

				personaggio.setEsperienza(0);
			}
		case "ladro":
			if (personaggio.getEsperienza() >= 200 && personaggio.getLivello() == 1) {
				personaggio.setLivello(2);
				personaggio.setAttacco(personaggio.getAttacco() + 10);
				personaggio.setDifesa(personaggio.getDifesa() + 10);
				personaggio.setPuntivita(personaggio.getPuntivita() + 10);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 10);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 400 && personaggio.getLivello() == 2) {
				personaggio.setLivello(3);
				personaggio.setAttacco(personaggio.getAttacco() + 20);
				personaggio.setDifesa(personaggio.getDifesa() + 20);
				personaggio.setPuntivita(personaggio.getPuntivita() + 20);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 20);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 700 && personaggio.getLivello() == 3) {
				personaggio.setLivello(4);
				personaggio.setAttacco(personaggio.getAttacco() + 30);
				personaggio.setDifesa(personaggio.getDifesa() + 30);
				personaggio.setPuntivita(personaggio.getPuntivita() + 30);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 30);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 1000 && personaggio.getLivello() == 4) {
				personaggio.setLivello(5);
				personaggio.setAttacco(personaggio.getAttacco() + 40);
				personaggio.setDifesa(personaggio.getDifesa() + 40);
				personaggio.setPuntivita(personaggio.getPuntivita() + 40);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 40);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 1500 && personaggio.getLivello() == 5) {
				personaggio.setLivello(6);
				personaggio.setAttacco(personaggio.getAttacco() + 50);
				personaggio.setDifesa(personaggio.getDifesa() + 50);
				personaggio.setPuntivita(personaggio.getPuntivita() + 50);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 50);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 2000 && personaggio.getLivello() == 6) {
				personaggio.setLivello(7);
				personaggio.setAttacco(personaggio.getAttacco() + 60);
				personaggio.setDifesa(personaggio.getDifesa() + 60);
				personaggio.setPuntivita(personaggio.getPuntivita() + 60);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 60);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 2500 && personaggio.getLivello() == 7) {
				personaggio.setLivello(8);
				personaggio.setAttacco(personaggio.getAttacco() + 70);
				personaggio.setDifesa(personaggio.getDifesa() + 70);
				personaggio.setPuntivita(personaggio.getPuntivita() + 70);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 70);

				personaggio.setEsperienza(0);
			}
			if (personaggio.getEsperienza() >= 3000 && personaggio.getLivello() == 8) {
				personaggio.setLivello(9);
				personaggio.setAttacco(personaggio.getAttacco() + 80);
				personaggio.setDifesa(personaggio.getDifesa() + 80);
				personaggio.setPuntivita(personaggio.getPuntivita() + 80);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 80);

				personaggio.setEsperienza(0);
			}

			if (personaggio.getEsperienza() >= 3500 && personaggio.getLivello() == 9) {
				personaggio.setLivello(10);
				personaggio.setAttacco(personaggio.getAttacco() + 100);
				personaggio.setDifesa(personaggio.getDifesa() + 100);
				personaggio.setPuntivita(personaggio.getPuntivita() + 100);
				personaggio.setPuntivitamax(personaggio.getPuntivitamax() + 100);

				personaggio.setEsperienza(0);
			}
		}

		return personaggio;
	}
}
