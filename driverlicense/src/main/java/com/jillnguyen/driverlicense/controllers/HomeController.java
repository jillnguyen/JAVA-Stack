package com.jillnguyen.driverlicense.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jillnguyen.driverlicense.models.Person;
import com.jillnguyen.driverlicense.service.PersonService;

@Controller
public class HomeController {
	private final PersonService personService;
	public HomeController(PersonService personService) {
		this.personService = personService;
	}
	@RequestMapping("/")
	public String index(Model model) {
		List<Person> persons = personService.allPersons();
		model.addAttribute("persons", persons);
		return "index.jsp";
	}
}
