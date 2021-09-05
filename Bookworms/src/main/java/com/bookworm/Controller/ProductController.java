package com.bookworm.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entity.Product;
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
	
	@PostMapping("/updateProduct/{id}")
	public Product updateProduct(Product prod) {
		return this.prodserv.updateProduct(prod);
	}
}
