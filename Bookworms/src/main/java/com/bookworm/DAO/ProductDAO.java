package com.bookworm.DAO;

import java.util.List;
import java.util.Optional;

import com.bookworm.entity.Product;


public interface ProductDAO {

	public Optional<Product> getProductbyID(int prod_id); 
	public Product SaveProduct(Product prod);
	public void DeleteProduct(int prod_id);
	public  List <Product> GetallProduct();
	public Product UpdateProduct(Product prod);
}
