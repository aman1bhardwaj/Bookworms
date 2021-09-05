package com.bookworm.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entity.Language;
import com.bookworm.service.LanguageService;

@RestController
public class LanguageController {

	@Autowired
	LanguageService langserv;
	
	@GetMapping("/getLanguage/{id}")
	public Optional<Language> GetProductByLanguage(@PathVariable("id")int lang_id){
		return this.langserv.getProductByLanguage(lang_id);
	}
	
	@GetMapping("/getallLanguage")
	public List<Language> GetallLanguage(){
		return this.langserv.getallLanguage();
	}
	
	@PostMapping("/saveLanguages")
	public Language saveLanguage(@RequestBody Language lang) {
		return this.langserv.saveLanguage(lang);
	}
}
