package com.bookworm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entity.Library;
import com.bookworm.service.LibraryService;



@RestController
public class LibraryController {

	@Autowired
	LibraryService LibrarySer;
	@GetMapping("/libpack/all")
	public List<Library> getAllLibrary(){
		return this.LibrarySer.getallLibrary();
	}
	
	@GetMapping("/libpack/{id}")
	public Library getLibraryById(@PathVariable("id") Integer id) {
		return this.LibrarySer.getLibraryById(id);
	}
	
	
	@PostMapping("/libpack")
	public Library saveLibrary( @RequestBody Library libpack) {
			return this.LibrarySer.saveLibrary(libpack);
	}
	
	
	@PutMapping("/libpack")
	public Library updateLibrary( @RequestBody Library libpack) {
			return this.LibrarySer.updateLibrary(libpack);
	}
	
	
	@DeleteMapping("/libpack/{id}")
	public String deleteLibrary(@PathVariable("id") Integer id) {
		return this.LibrarySer.deleteLibraryById(id);
	}
}
