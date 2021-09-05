package com.bookworm.DAO;

import java.util.List;
import java.util.Optional;

import com.bookworm.entity.Genre;


public interface GenreDAO {
	
	public Optional<Genre> getProductByGenre(int gen_id);
	public Genre SaveGenre(Genre gen);
	public List<Genre> GetallGenre();

}
