package com.bookworm.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookworm.entity.Author;
import com.bookworm.repository.AuthorRepository;

@Component
public class AuthorDAOImpl implements AuthorDAO{
	
	@Autowired
	AuthorRepository authrepo;

	@Override
	public Optional<Author> getProductByAuthor(int auth_id) {
		// TODO Auto-generated method stub
		return this.authrepo.findById(auth_id);
	}

	@Override
	public Author SaveAuthor(Author auth) {
		// TODO Auto-generated method stub
		return this.authrepo.save(auth);
	}

	@Override
	public List<Author> GetallAuthor() {
		// TODO Auto-generated method stub
		return this.authrepo.findAll();
	}

}
