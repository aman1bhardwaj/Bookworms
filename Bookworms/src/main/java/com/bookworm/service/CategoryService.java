package com.bookworm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.DAO.CategoryDAO;
import com.bookworm.entity.Category;


@Service
public class CategoryService {
	
	@Autowired
	CategoryDAO catedao;
	
	public Optional<Category> GetProductbyCategory(int cate_id){
		return this.catedao.getProductbyCategory(cate_id);
	}

	public Category saveCategory(Category cate) {
	return this.catedao.SaveCategory(cate);
	}
	
	public List<Category> getallCategory(){
		return this.catedao.GetallCategory();
	}
}

