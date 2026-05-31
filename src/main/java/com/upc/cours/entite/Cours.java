package com.upc.cours.entite;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "cours")
public class Cours {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String intitule;
	private String enseignant;
	private String salle;

	public Cours() {
	}

	public Cours(int id, String intitule, String enseignant, String salle) {
		this.id = id;
		this.intitule = intitule;
		this.enseignant = enseignant;
		this.salle = salle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(String enseignant) {
		this.enseignant = enseignant;
	}

	public String getSalle() {
		return salle;
	}

	public void setSalle(String salle) {
		this.salle = salle;
	}

}
