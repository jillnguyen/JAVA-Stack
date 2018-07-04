package com.jillnguyen.language.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jillnguyen.language.models.Language;
import com.jillnguyen.language.service.LanguageService;


@Controller
public class LanguagesController {
	private final LanguageService languageService;
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }
    
//  Links to show all languages - index page
    @RequestMapping("/languages")
    public String index(Model model) {
    	List<Language> languages = languageService.allLanguages();
    	model.addAttribute("languages", languages);
    	model.addAttribute("language", new Language());
    	return "index.jsp";
    }
    
//	POST to create a new language
    @RequestMapping(value="/create", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
    	if (result.hasErrors()) {
            return "index.jsp";
        } else {
            languageService.createLanguage(language);
            return "redirect:/languages";
        }
    }   

    
//	Link to edit a language
    @RequestMapping("/languages/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
    	Language lang = languageService.findLanguage(id);
    	model.addAttribute("language", lang);
    	return "edit.jsp";
    }
    
    @RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("language") Language lang, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            languageService.updateLanguage(lang);
            return "redirect:/languages";
        }
    }
    
//  Show a language
    @RequestMapping("/languages/{id}")
    public String show(Model model, @PathVariable("id") Long id) {
    	Language lang = languageService.findLanguage(id);
    	model.addAttribute("language", lang);
    	return "show.jsp";
    }
    
//  Delete a language
    @RequestMapping(value="languages/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
    	languageService.deleteLanguage(id);
    	return "redirect:/languages";
    }
}
