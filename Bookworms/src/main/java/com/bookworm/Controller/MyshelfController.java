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

import com.bookworm.entity.Myshelf;
import com.bookworm.service.MyshelfService;



@RestController
public class MyshelfController {

	@Autowired
	MyshelfService myshelfSer;
	
	@GetMapping("/myshelf/all")
	public List<Myshelf> getAllMyshelf(){
		return this.myshelfSer.getallMyshelf();
	}
	
	@GetMapping("/myshelf/{id}")
	public Myshelf getMyshelfById(@PathVariable("id") Integer id) {
		return this.myshelfSer.getMyshelfById(id);
	}
	
	
	@PostMapping("/myshelf")
	public Myshelf saveMyshelf( @RequestBody Myshelf myshelfSer) {
			return this.myshelfSer.saveMyshelf(myshelfSer);
	}
	
	
	@PutMapping("/myshelf")
	public Myshelf updateMyshelf( @RequestBody Myshelf myshelfSer) {
			return this.myshelfSer.updateMyshelf(myshelfSer);
	}
	
	
	@DeleteMapping("/myshelf/{id}")
	public String deleteMyshelf(@PathVariable("id") Integer id) {
		return this.myshelfSer.deleteMyshelfById(id);
	}
}
