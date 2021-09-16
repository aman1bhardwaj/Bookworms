package com.bookworm.DAO;

import java.util.List;

import com.bookworm.entity.Myshelf;


public interface MyshelfDAO {

	public List<Myshelf>  getallMyshelf();
	public Myshelf getMyshelfById(Integer id);
	public Myshelf saveMyshelf(Myshelf myshelf);
	public Myshelf updateMyshelf(Myshelf myshelf);
	public String deleteMyshelfById(Integer id);
}
