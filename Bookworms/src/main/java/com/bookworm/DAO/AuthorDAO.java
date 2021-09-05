package com.bookworm.DAO;

import java.util.List;
import java.util.Optional;

import com.bookworm.entity.Author;

public interface AuthorDAO {
	
	public Optional<Author> getProductByAuthor(int auth_id);
	public Author SaveAuthor(Author auth);
	public List<Author> GetallAuthor();

}
