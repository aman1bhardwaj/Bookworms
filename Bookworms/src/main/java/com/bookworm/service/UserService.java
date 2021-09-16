package com.bookworm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.DAO.UserDAO;
import com.bookworm.entity.UserTable;


@Service
public class UserService {

	@Autowired
	UserDAO userDao;

	
	public List<UserTable> getallUser() {
		return this.userDao.getallUser();
	}


	public UserTable getUserById(Integer id) {

		return this.userDao.getUserById(id);
	}


	public UserTable saveUser(UserTable user) {
		return this.userDao.saveUser(user);
	}


	public UserTable updateUser(UserTable user) {
		return this.userDao.updateUser(user);
	}


	public String deleteUserById(Integer id) {
	
		return this.userDao.deleteUserById(id);
	}
}
