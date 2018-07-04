package com.jillnguyen.driverlicense.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jillnguyen.driverlicense.models.Person;
import com.jillnguyen.driverlicense.service.PersonService;

@Controller
public class PersonsController {
	private final PersonService personService;
	public PersonsController(PersonService personService) {
		this.personService = personService;
	}
	
//	Render create person page
	@RequestMapping("/persons/new")
	public String personPage(Model model) {
		model.addAttribute("person", new Person());
		return "persons/new.jsp";
	}
	
//	Create a new person
	@PostMapping("/newPerson")
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "persons/new.jsp";
		} else {
			personService.createPerson(person);
			return "redirect:/";
		}
	}

	
//	Show a person page
	@RequestMapping("/persons/{id}")
	public String showPerson(Model model, @PathVariable("id") Long id) {
		Person person = personService.getPerson(id);
		model.addAttribute("person", person);
		return "persons/show.jsp";
	}
	
}
