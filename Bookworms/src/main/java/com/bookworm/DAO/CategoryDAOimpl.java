package com.bookworm.DAO;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookworm.entity.Category;
import com.bookworm.entity.Product;
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

}
