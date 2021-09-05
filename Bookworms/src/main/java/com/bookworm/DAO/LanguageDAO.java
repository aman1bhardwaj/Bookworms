package com.bookworm.DAO;

import java.util.Optional;

import com.bookworm.entity.Language;

public interface LanguageDAO {
	
	public Optional<Language> GetallProductByLanguage(int lang_id);

}
