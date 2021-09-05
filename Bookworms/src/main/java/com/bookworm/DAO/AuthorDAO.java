package com.bookworm.DAO;

import java.util.Optional;

import com.bookworm.entity.Author;

public interface AuthorDAO {
	
	public Optional<Author> getProductByAuthor(int auth_id);

}
