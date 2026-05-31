package com.upc.cours.acces;

import java.util.List;

import com.upc.cours.entite.Cours;

public interface CoursAcces {

	List<Cours> rechercher(String recherche);

}
