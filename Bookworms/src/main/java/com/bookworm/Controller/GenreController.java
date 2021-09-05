package com.bookworm.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entity.Genre;
import com.bookworm.service.GenreService;

@RestController
public class GenreController {
	
	@Autowired
	GenreService genserv;
	
	@GetMapping("/getGenre/{id}")
	public Optional<Genre> GetProductByGenre(@PathVariable("id") int gen_id){
		return this.genserv.GetProductByGenre(gen_id);
	}
	
	@GetMapping("/getallGenre")
	public List<Genre> getallGenre() {
		return this.genserv.getallGenre();
	}
	
	@PostMapping("/saveGenre")
	public Genre saveGenre(@RequestBody Genre gen) {
		return this.genserv.saveGenre(gen);
		
	}
	
}
