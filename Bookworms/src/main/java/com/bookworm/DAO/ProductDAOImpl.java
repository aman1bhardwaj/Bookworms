package com.bookworm.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookworm.entity.Product;
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
	public Product UpdateProduct(Product prod) {
		// TODO Auto-generated method stub
		return this.prorepo.save(prod);
	}
	
	

}
