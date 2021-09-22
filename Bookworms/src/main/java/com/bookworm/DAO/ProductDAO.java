package com.bookworm.DAO;

import java.util.List;
import java.util.Optional;

import com.bookworm.entity.Author;
import com.bookworm.entity.Genre;
import com.bookworm.entity.Language;
import com.bookworm.entity.Product;
import com.bookworm.entity.Publisher;


public interface ProductDAO {

	public Optional<Product> getProductbyID(int prod_id); 
	public Product SaveProduct(Product prod);
	public void DeleteProduct(int prod_id);
	public  List <Product> GetallProduct();
	public Product UpdateProduct(Product prod,int prod_id);
	public List<Product> GetallProductByCategory(int cate_id);
	public Optional<Genre> getProductByGenre(int gen_id);
	public List<Language> GetallProductByLanguage(int lang_id);
	public List<Author> getProductByAuthor(int auth_id);
	public Optional<Publisher> getProductByPublisher(int pub_id);
	
}
