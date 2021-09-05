package com.bookworm.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookworm.entity.Genre;
import com.bookworm.repository.GenreRepository;

@Component
public class GenreDAOImpl implements GenreDAO{
	
	@Autowired
	GenreRepository genrepo;

	@Override
	public Optional<Genre> getProductByGenre(int gen_id) {
		// TODO Auto-generated method stub
		return this.genrepo.findById(gen_id);
	}

	@Override
	public Genre SaveGenre(Genre gen) {
		// TODO Auto-generated method stub
		return this.genrepo.save(gen);
	}

	@Override
	public List<Genre> GetallGenre() {
		// TODO Auto-generated method stub
		return this.genrepo.findAll();
	}

}
