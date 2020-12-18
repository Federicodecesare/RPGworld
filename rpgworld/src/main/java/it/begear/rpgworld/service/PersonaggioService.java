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
}