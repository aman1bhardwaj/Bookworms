package com.bookworm.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entity.Author;
import com.bookworm.service.AuthorService;

@RestController
public class AuthorController {

	@Autowired
	AuthorService authserv;
	
	@GetMapping("/getauthor/{id}")
	public Optional<Author> GetProductByAuthor(@PathVariable("id") int auth_id){
		return this.authserv.GetProductByAuthor(auth_id);
	}
	
	@GetMapping("/getallauthor")
	public List<Author> GetallAuthor(){
		return this.authserv.getallAuthor();
	}
	
	@PostMapping("/saveAuthor")
	public Author saveAuthor(@RequestBody Author auth) {
		return this.authserv.saveAuthor(auth);
		
	}
	
}
