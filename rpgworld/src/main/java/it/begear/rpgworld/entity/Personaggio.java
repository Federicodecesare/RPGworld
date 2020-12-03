package it.begear.rpgworld.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personaggio")
public class Personaggio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idpersonaggio")
	private int idpersonaggio;
	@Column(name="nome")
	private String nome;
	@Column(name="classe")
	private String classe;
	@Column(name="puntivitamax")
	private int puntivitamax;
	@Column(name="puntivita")
	private int puntivita;
	@Column(name="attacco")
	private int attacco;
	@Column(name="difesa")
	private int difesa;
	@Column(name="sesso")
	private String sesso;
	@Column(name="livello")
	private int livello;
	@Column(name ="esperienza")
	private int esperienza;
	public Personaggio() {
		// TODO Auto-generated constructor stub
	}
	public int getIdpersonaggio() {
		return idpersonaggio;
	}
	public void setIdpersonaggio(int idpersonaggio) {
		this.idpersonaggio = idpersonaggio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public int getPuntivitamax() {
		return puntivitamax;
	}
	public void setPuntivitamax(int puntivitamax) {
		this.puntivitamax = puntivitamax;
	}
	public int getPuntivita() {
		return puntivita;
	}
	public void setPuntivita(int puntivita) {
		this.puntivita = puntivita;
	}
	public int getAttacco() {
		return attacco;
	}
	public void setAttacco(int attacco) {
		this.attacco = attacco;
	}
	public int getDifesa() {
		return difesa;
	}
	public void setDifesa(int difesa) {
		this.difesa = difesa;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	public int getLivello() {
		return livello;
	}
	public void setLivello(int livello) {
		this.livello = livello;
	}
	public int getEsperienza() {
		return esperienza;
	}
	public void setEsperienza(int esperienza) {
		this.esperienza = esperienza;
	}
	
	
	
	
}
