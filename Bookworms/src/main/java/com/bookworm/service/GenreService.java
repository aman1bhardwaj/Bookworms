package com.bookworm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.DAO.GenreDAO;
import com.bookworm.entity.Genre;

@Service
public class GenreService {
	
	@Autowired
	GenreDAO gendao;
	
	public Optional<Genre> GetProductByGenre(int gen_id){
		return this.gendao.getProductByGenre(gen_id);
	}

	public Genre saveGenre(Genre gen) {
		return this.gendao.SaveGenre(gen);
	}
	
	public List<Genre> getallGenre() {
		return this.gendao.GetallGenre();
	}
}
