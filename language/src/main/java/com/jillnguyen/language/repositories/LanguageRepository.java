package com.jillnguyen.language.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jillnguyen.language.models.Language;


@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{

// this method retrieves all the languages from the database
    List<Language> findAll();
    
    
// this method counts how many names contain a certain string
    Long countByNameContaining(String search);
    
// this method deletes a language that starts with a specific title
    Long deleteByNameStartingWith(String search);
    
//    this method deletes a language by ID
    void deleteById(Long id);

//	
      

}
