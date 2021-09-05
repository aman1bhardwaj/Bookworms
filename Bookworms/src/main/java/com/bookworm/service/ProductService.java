package com.bookworm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.DAO.AuthorDAO;
import com.bookworm.DAO.CategoryDAO;
import com.bookworm.DAO.GenreDAO;
import com.bookworm.DAO.LanguageDAO;
import com.bookworm.DAO.ProductDAO;
import com.bookworm.DAO.PublisherDAO;
import com.bookworm.entity.Author;
import com.bookworm.entity.Category;
import com.bookworm.entity.Genre;
import com.bookworm.entity.Language;
import com.bookworm.entity.Product;
import com.bookworm.entity.Publisher;

@Service
public class ProductService {
	
	@Autowired
	ProductDAO prodao;
	
	@Autowired
	CategoryDAO catedao;
	
	@Autowired
	LanguageDAO langdao;
	
	@Autowired
	GenreDAO gendao;
	
	@Autowired
	AuthorDAO authdao;
	
	@Autowired
	PublisherDAO pubdao;

	
	public Optional<Product> getProductbyID(int prod_id){
		return this.prodao.getProductbyID(prod_id);
	}
	
	public Product SaveProduct(Product prod) {
		return this.prodao.SaveProduct(prod);
	}
	
	public void DeleteProduct(int prod_id) {
		this.prodao.DeleteProduct(prod_id);
	}
	
	public  List <Product> GetallProduct(){
		return this.prodao.GetallProduct();
	}
	
	public Product UpdateProduct(Product prod) {
		return this.prodao.UpdateProduct(prod);
	}
	
	public Optional<Category> getProductbyCategory(int cate_id){
		return this.catedao.getProductbyCategory(cate_id);
	}
	
	/*public Optional<Language> GetallProductByLanguage(int lang_id){
		return this.langdao.GetallProductByLanguage(lang_id);
	}
	
	public Optional<Genre> getProductByGenre(int gen_id){
		return this.gendao.getProductByGenre(gen_id);
	}
	
	public Optional<Author> getProductByAuthor(int auth_id){
		return this.authdao.getProductByAuthor(auth_id);
	}
	
	public Optional<Publisher> getProductByPublisher(int pub_id){
		return this.pubdao.getProductByPublisher(pub_id);
	}*/
		
}
