package com.upc.cours.metier;

import java.util.List;

import com.upc.cours.entite.Cours;

public interface CoursMetier {

	List<Cours> listerCours(String recherche);

}
