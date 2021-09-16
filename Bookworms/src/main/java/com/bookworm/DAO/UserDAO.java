package com.bookworm.DAO;

import java.util.List;

import com.bookworm.entity.UserTable;


public interface UserDAO {


	public List<UserTable>  getallUser();
	public UserTable getUserById(Integer id);
	public UserTable saveUser(UserTable user);
	public UserTable updateUser(UserTable user);
	public String deleteUserById(Integer id);
}
