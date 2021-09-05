package com.bookworm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.DAO.LanguageDAO;
import com.bookworm.entity.Language;

@Service
public class LanguageService {
	
	@Autowired
	LanguageDAO langdao;
	
	public Optional<Language> getProductByLanguage(int lang_id)
	{
		return this.langdao.GetProductByLanguage(lang_id);
	}
	
	public Language saveLanguage(Language lang) {
		return this.langdao.SaveLanguage(lang);
	}
	public List<Language> getallLanguage(){
		return this.langdao.GetallLanguage();
	}

}
