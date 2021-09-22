package com.bookworm.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookworm.entity.Author;
import com.bookworm.entity.Genre;
import com.bookworm.entity.Language;
import com.bookworm.entity.Product;
import com.bookworm.entity.Publisher;
import com.bookworm.repository.ProductRepository;

@Component
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	ProductRepository prorepo;

	@Override
	public Optional<Product> getProductbyID(int prod_id) {
		// TODO Auto-generated method stub
		return this.prorepo.findById(prod_id);
	}

	@Override
	public Product SaveProduct(Product prod) {
		// TODO Auto-generated method stub
		return this.prorepo.save(prod);
	}

	@Override
	public void DeleteProduct(int prod_id) {
		// TODO Auto-generated method stub
		this.prorepo.deleteById(prod_id);
	}
	
	@Override
	public List<Product> GetallProduct() {
		// TODO Auto-generated method stub
		return this.prorepo.findAll();
	}
	
	@Override
	public Product UpdateProduct(Product prod,int prod_id) {
		if(this.prorepo.existsById(prod_id)) {
		prod=this.prorepo.save(prod);}
		return prod;
	}

	@Override
	public List<Product> GetallProductByCategory(int cate_id) {
		// TODO Auto-generated method stub
		return this.prorepo.GetallProductByCategory(cate_id);
	}

	@Override
	public Optional<Genre> getProductByGenre(int gen_id) {
		// TODO Auto-generated method stub
		return this.prorepo.getProductByGenre(gen_id);
	}

	@Override
	public List<Language> GetallProductByLanguage(int lang_id) {
		// TODO Auto-generated method stub
		return this.prorepo.GetallProductByLanguage(lang_id);
	}

	@Override
	public List<Author> getProductByAuthor(int auth_id) {
		// TODO Auto-generated method stub
		return this.prorepo.getProductByAuthor(auth_id);
	}

	@Override
	public Optional<Publisher> getProductByPublisher(int pub_id) {
		// TODO Auto-generated method stub
		return this.prorepo.getProductByPublisher(pub_id);
	}
	
	

}
