package com.bookworm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.DAO.MyshelfDAO;
import com.bookworm.entity.Myshelf;


@Service
public class MyshelfService {

	@Autowired
	MyshelfDAO myshelfDao;
	
	public List<Myshelf> getallMyshelf() {
		return this.myshelfDao.getallMyshelf();
	}


	public Myshelf getMyshelfById(Integer id) {

		return this.myshelfDao.getMyshelfById(id);
	}


	public Myshelf saveMyshelf(Myshelf myshelf) {
		return this.myshelfDao.saveMyshelf(myshelf);
	}


	public Myshelf updateMyshelf(Myshelf myshelf) {
		return this.myshelfDao.updateMyshelf(myshelf);
	}


	public String deleteMyshelfById(Integer id) {
	
		return this.myshelfDao.deleteMyshelfById(id);
	}
}
