package com.bookworm.DAO;

import java.util.Optional;

import com.bookworm.entity.Category;
import com.bookworm.entity.Product;


public interface CategoryDAO {

	public Optional<Category> getProductbyCategory(int cate_id); 
}
