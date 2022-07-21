package com.codingdojo.newspring.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String home(Model model) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hersheys");
		list.add("Snickers");
		list.add("Reeses");
		list.add("Three Musketeers");
		list.add("Skittles");
		list.add("Sour Patch Kids");
		model.addAttribute("candies", list);
		return "index.jsp";
	}
	
	@RequestMapping("/stuff")
	public String stuff() {
		return "stuff.jsp";
	}
}
