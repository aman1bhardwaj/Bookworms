package com.bookworm.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entity.Publisher;
import com.bookworm.service.PublisherService;

@RestController
public class PublisherController {
	
	@Autowired
	PublisherService pubserv;
	
	@GetMapping("/getPublisher/{id}")
	public Optional<Publisher> getProductByPublisher(@PathVariable("id") int pub_id){
		return this.pubserv.GetProductByPublisher(pub_id);
		
	}

	@GetMapping("/getallPublisher")
	public List<Publisher> GetallPublisher(){
		return this.pubserv.getallPublisher();
		
	}
	
	@PostMapping("/savePublisher")
	public Publisher SavePublisher(@RequestBody Publisher pub) {
		return this.pubserv.savePublisher(pub);
	}
}
