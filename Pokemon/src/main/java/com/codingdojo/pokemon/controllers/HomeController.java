package com.codingdojo.pokemon.controllers;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	ArrayList<String> pokemon = new ArrayList<>();
	
	@RequestMapping("/")
	public String index(Model model) {
		String[] gens = {"1st","2nd","3rd","4th","5th","6th", "7th", "8th"};
		String[] types = {"None","Fire", "Grass", "Electric", "Psychic", "Steel", "Ground", "Ghost", "Dark", "Dragon", "Ice", "Water", "Normal", "Fairy"};
		
		model.addAttribute("gens", gens);
		model.addAttribute("types", types);
		
 		return "index.jsp";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(HttpSession session,
			@RequestParam(value="name") String name,
			@RequestParam(value="generation") String generation, 
			@RequestParam(value="type1") String type1, 
			@RequestParam(value="type2") String type2) {	
		
			session.setAttribute("name", name);
			session.setAttribute("generation", generation);
			session.setAttribute("type1", type1);
			session.setAttribute("type2", type2);
			System.out.println("Sending data");
			pokemon.add(name);
		
		return "redirect:/results";
		
	}
	
	@GetMapping("/results")
	public String results(Model model) {
		model.addAttribute("pokemon", pokemon);
		return "results.jsp";
	}
 
}
