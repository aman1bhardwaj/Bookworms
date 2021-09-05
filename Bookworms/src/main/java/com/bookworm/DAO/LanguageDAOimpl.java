package com.bookworm.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookworm.entity.Language;
import com.bookworm.repository.LanguageRepository;

@Component
public class LanguageDAOimpl implements LanguageDAO {

	@Autowired
	LanguageRepository langrepo;

	@Override
	public Optional<Language> GetProductByLanguage(int lang_id) {
		// TODO Auto-generated method stub
		return this.langrepo.findById(lang_id);
	}

	@Override
	public Language SaveLanguage(Language lang) {
		// TODO Auto-generated method stub
		return this.langrepo.save(lang);
	}

	@Override
	public List<Language> GetallLanguage() {
		// TODO Auto-generated method stub
		return this.langrepo.findAll();
	}
	
	
}
