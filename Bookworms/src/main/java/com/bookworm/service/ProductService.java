package com.bookworm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.DAO.ProductDAO;
import com.bookworm.entity.Author;
import com.bookworm.entity.Genre;
import com.bookworm.entity.Language;
import com.bookworm.entity.Product;
import com.bookworm.entity.Publisher;

@Service
public class ProductService {
	
	@Autowired
	ProductDAO prodao;
	
	public Optional<Product> GetProductbyID(int prod_id){
		return this.prodao.getProductbyID(prod_id);
	}
	
	public Product saveProduct(Product prod) {
		return this.prodao.SaveProduct(prod);
	}
	
	public void deleteProduct(int prod_id) {
		this.prodao.DeleteProduct(prod_id);
	}
	
	public  List <Product> getallProduct(){
		return this.prodao.GetallProduct();
	}
	
	public Product updateProduct(Product prod,int prod_id) {
		return this.prodao.UpdateProduct(prod,prod_id);
		
	}
	
	public List<Product> GetallProductByCategory(int cate_id){
		return this.prodao.GetallProductByCategory(cate_id);
	}
	
	public Optional<Genre> getProductByGenre(int gen_id){
		return this.prodao.getProductByGenre(gen_id);
	}
	
	public List<Language> GetallProductByLanguage(int lang_id){
		return this.prodao.GetallProductByLanguage(lang_id);
	}
	
	/*public List<Author> getProductByAuthor(int auth_id){
		return this.prodao.getProductByAuthor(auth_id);
	}*/
	
	public Optional<Publisher> getProductByPublisher(int pub_id){
		return this.prodao.getProductByPublisher(pub_id);
	}
		
}
