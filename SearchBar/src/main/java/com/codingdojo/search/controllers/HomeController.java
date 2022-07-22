package com.codingdojo.search.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

		@RequestMapping("/")
		public String index() {
			return "index.jsp";
		}
		
		@RequestMapping("/search")
		public String search(@RequestParam(value="name") String name, Model model) {
			model.addAttribute("name", name);
			return "name.jsp"; 
		}
}
