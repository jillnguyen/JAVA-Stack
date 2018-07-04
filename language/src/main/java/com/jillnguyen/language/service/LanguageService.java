package com.jillnguyen.language.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jillnguyen.language.models.Language;
import com.jillnguyen.language.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository languageRepository;
    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
    
//	Retrieve all languages
    public List<Language> allLanguages(){
    	return languageRepository.findAll();
    }

    
// creates a language
    public Language createLanguage(Language l) {
    	return languageRepository.save(l);
    }
    
// retrieves a language
    public Language findLanguage(Long id) {
    	Optional<Language> optionalLanguage = languageRepository.findById(id);
    	if (optionalLanguage.isPresent()) {
    		return optionalLanguage.get();
    	} else {
    		return null;
    	}
    }
  
//    update a language
    public Language updateLanguage(Long id, String name, String creator, String currentVersion) {
    	Optional<Language> updateLanguage = languageRepository.findById(id);
    	Language l = updateLanguage.get();
    	l.setName(name);
    	l.setCreator(creator);
    	l.setCurrentVersion(currentVersion);
    	return languageRepository.save(l);
    }
    
    
    public Language updateLanguage(Language l) {
    	return languageRepository.save(l);
    }
    
//    delete a language by ID
    public void deleteLanguage(Long id) {
    	languageRepository.deleteById(id);
    }

}
