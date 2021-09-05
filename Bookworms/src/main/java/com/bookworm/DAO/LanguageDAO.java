package com.bookworm.DAO;

import java.util.List;
import java.util.Optional;

import com.bookworm.entity.Language;

public interface LanguageDAO {
	
	public Optional<Language> GetProductByLanguage(int lang_id);
	public Language SaveLanguage(Language lang);
	public List<Language> GetallLanguage();

}