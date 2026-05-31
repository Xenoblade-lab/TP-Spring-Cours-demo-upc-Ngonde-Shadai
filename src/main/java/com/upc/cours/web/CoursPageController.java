package com.upc.cours.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.upc.cours.metier.CoursMetier;

@Controller
@RequestMapping("/formation")
public class CoursPageController {

	@Autowired
	private CoursMetier coursMetier;

	@GetMapping("/cours")
	public String afficherCatalogue(
			@RequestParam(value = "recherche", required = false) String recherche,
			Model model) {

		model.addAttribute("termeRecherche", recherche);
		model.addAttribute("listeCours", coursMetier.listerCours(recherche));

		return "liste-cours";
	}

}
