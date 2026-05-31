package com.upc.cours.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upc.cours.acces.CoursAcces;
import com.upc.cours.entite.Cours;

@Service
public class CoursMetierImpl implements CoursMetier {

	@Autowired
	private CoursAcces coursAcces;

	@Override
	public List<Cours> listerCours(String recherche) {
		return coursAcces.rechercher(recherche);
	}

}
