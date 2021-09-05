package com.bookworm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.DAO.AuthorDAO;
import com.bookworm.entity.Author;

@Service
public class AuthorService {
	
	@Autowired
	AuthorDAO authdao;
	
	public Optional<Author> GetProductByAuthor(int auth_id){
		return this.authdao.getProductByAuthor(auth_id);
	}

	public Author saveAuthor(Author auth) {
		return this.authdao.SaveAuthor(auth);
	}
	
	public List<Author> getallAuthor(){
		return this.authdao.GetallAuthor();
	}
}
