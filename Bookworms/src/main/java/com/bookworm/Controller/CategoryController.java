package com.bookworm.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entity.Category;
import com.bookworm.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	CategoryService cateserv;
	
	@PostMapping("/savecategory")
	public Category SaveCategory(@RequestBody Category cate) {
		return this.cateserv.saveCategory(cate);
	}
	
	@GetMapping("/GetCategory/{id}")
	public Optional<Category> getProductbyCategory( @PathVariable("id")int cate_id){
		return this.cateserv.GetProductbyCategory(cate_id);
	}
	
	@GetMapping("/getAllCategories")
	public List<Category> GetallCategory(){
		return this.cateserv.getallCategory();
	}
	
	

}
