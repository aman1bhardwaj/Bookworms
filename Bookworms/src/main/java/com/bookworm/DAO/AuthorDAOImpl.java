package com.bookworm.DAO;

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

}
