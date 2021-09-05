package com.bookworm.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookworm.entity.Category;
import com.bookworm.repository.CategoryRepository;

@Component
public class CategoryDAOimpl implements CategoryDAO{
	
	
	@Autowired
	CategoryRepository caterepo;

	@Override
	public Optional<Category> getProductbyCategory(int cate_id) {
		// TODO Auto-generated method stub
		return this.caterepo.findById(cate_id);
	}

	@Override
	public Category SaveCategory(Category cate) {
		// TODO Auto-generated method stub
		return this.caterepo.save(cate);
	}

	@Override
	public List<Category> GetallCategory() {
		// TODO Auto-generated method stub
		return this.caterepo.findAll();
	}

}
