package com.jillnguyen.driverlicense.controllers;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jillnguyen.driverlicense.models.License;
import com.jillnguyen.driverlicense.models.Person;
import com.jillnguyen.driverlicense.service.LicenseService;
import com.jillnguyen.driverlicense.service.PersonService;

@Controller

public class LicensesController {
	private final LicenseService licenseService;
	private final PersonService personService;
	public LicensesController(LicenseService licenseService, PersonService personService) {
		this.licenseService = licenseService;
		this.personService = personService;
	}
	
//	Render new license page 
	@RequestMapping("/licenses/new")
	public String licensePage(Model model, ModelMap mv) {
		Map<Object, String> options = new LinkedHashMap<Object, String>();
		List<Person> persons = personService.allPersons();
		for (int p=0; p<persons.size(); p++) {
			options.put(persons.get(p), persons.get(p).getFirstName() + " " + persons.get(p).getLastName());
		}
		mv.addAttribute("persons", options);
		model.addAttribute("license", new License());
		return "licenses/new.jsp";
	}
	

//	POST to create a new license
	@RequestMapping(value="/newLicense", method=RequestMethod.POST)
	public String create (@Valid @ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "licenses/new.jsp";
		} else {
//			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(ep);
//			license.setExpiration_date(ep);
			licenseService.createLicense(license);
			return "redirect:/";
		}
	}
	
	
}
