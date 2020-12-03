package it.begear.rpgworld.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.begear.rpgworld.entity.Personaggio;

public interface PersonaggioRepository extends JpaRepository<Personaggio, Integer>{

	@Query("SELECT p FROM Personaggio p WHERE CONCAT(p.nome, p.classe, p.puntivitamax, p.puntivita, p.attacco, p.difesa) LIKE %?1%")
	public List<Personaggio> search(String keyword);
	
}