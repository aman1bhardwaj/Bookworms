package com.bookworm.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entity.Author;
import com.bookworm.entity.Genre;
import com.bookworm.entity.Language;
import com.bookworm.entity.Product;
import com.bookworm.entity.Publisher;
import com.bookworm.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService prodserv;
	
	@PostMapping("/saveProduct")
	public Product saveProduct( @RequestBody Product prod) {
		return this.prodserv.saveProduct(prod);
	}
	
	@GetMapping("/getProduct/{id}")
	public Optional<Product> GetProductbyID(@PathVariable("id") int prod_id){
		return this.prodserv.GetProductbyID(prod_id);
	}
	
	@DeleteMapping("/deleteProducts/{id}")
	public String deleteProduct(@PathVariable("id") int prod_id) {
		this.prodserv.deleteProduct(prod_id);
		return "Deleted";
	}

	@GetMapping("/getProducts")
	public  List <Product> getallProduct(){
		return this.prodserv.getallProduct();
	}
	
	@PutMapping("/updateProduct/{id}")
	public Product UpdateProduct( @RequestBody Product prod, @PathVariable("id") int prod_id) {
		return this.prodserv.updateProduct(prod,prod_id);
	}
	
	@GetMapping("/productbycategory/{id}")
	public List<Product> GetallProductByCategory(@PathVariable("id") int cate_id){
		return this.prodserv.GetallProductByCategory(cate_id);  
	}
	
	@GetMapping("/productbygenre/{id}")
	public Optional<Genre> getProductByGenre(@PathVariable("id") int gen_id){
		return this.prodserv.getProductByGenre(gen_id);
	}
	
	@GetMapping("/productbylanguage/{id}")
	public List<Language> GetallProductByLanguage(@PathVariable("id") int lang_id) {
		// TODO Auto-generated method stub
		return this.prodserv.GetallProductByLanguage(lang_id);
	}
	
	/*@GetMapping("/productbyauthor/{id}")
	public List<Author> getProductByAuthor(@PathVariable("id") int auth_id) {
		// TODO Auto-generated method stub
		return this.prodserv.getProductByAuthor(auth_id);
	}*/
	@GetMapping("/productbypublisher/{id}")
	public Optional<Publisher> getProductByPublisher(@PathVariable("id") int pub_id){
		return this.prodserv.getProductByPublisher(pub_id);
	}
}
