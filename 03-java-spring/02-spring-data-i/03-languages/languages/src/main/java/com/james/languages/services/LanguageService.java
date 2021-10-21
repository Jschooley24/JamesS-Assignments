package com.james.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.james.languages.models.Language;
import com.james.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository lRepo;
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	public List<Language> allLanguages(){
		return this.lRepo.findAll();
	}
	
	public Language findLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	public Language createLanguage(Language newLanguage) {
		return this.lRepo.save(newLanguage);
	}
	public Language updateLanguage(Language updateLanguage) {
		return this.lRepo.save(updateLanguage);
	}
	public String deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
		return "this language has been delete";
	}

}
