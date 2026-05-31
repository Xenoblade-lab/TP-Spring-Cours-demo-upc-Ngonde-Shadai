package com.upc.cours.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.upc.cours.entite.Cours;
import com.upc.cours.metier.CoursMetier;

@RestController
@RequestMapping("/api/formation")
public class CoursApiController {

	@Autowired
	private CoursMetier coursMetier;

	@GetMapping("/cours")
	public List<Cours> listerEnJson(
			@RequestParam(value = "recherche", required = false) String recherche) {
		return coursMetier.listerCours(recherche);
	}

}
