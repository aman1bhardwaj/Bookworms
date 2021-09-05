package com.bookworm.DAO;

import java.util.List;
import java.util.Optional;

import com.bookworm.entity.Category;


public interface CategoryDAO {

	public Optional<Category> getProductbyCategory(int cate_id); 
	public Category SaveCategory(Category cate);
	public List<Category> GetallCategory();
}
