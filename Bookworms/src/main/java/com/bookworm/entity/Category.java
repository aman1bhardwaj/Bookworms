package com.bookworm.entity;

import javax.persistence.*;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@OneToMany(cascade=CascadeType.ALL)
	int cate_id;
	String category;
	
	
	public Category() {
		super();
	}
	
	
	public Category(int cate_id, String category) {
		this.cate_id = cate_id;
		this.category = category;
	}
	
	
	
	public int getCate_id() {
		return cate_id;
	}
	public void setCate_id(int cate_id) {
		this.cate_id = cate_id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	@Override
	public String toString() {
		return "Category [cate_id=" + cate_id + ", category=" + category + "]";
	}
	
	
	
}
