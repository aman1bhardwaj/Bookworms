package com.bookworm.entity;

import javax.persistence.*;


@Entity
public class Language {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int lang_id;
	String language;
	
	public Language() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Language(int lang_id, String language) {
		this.lang_id = lang_id;
		this.language = language;
	}

	public int getLang_id() {
		return lang_id;
	}

	public void setLang_id(int lang_id) {
		this.lang_id = lang_id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Language [lang_id=" + lang_id + ", language=" + language + "]";
	}
	
	

}
