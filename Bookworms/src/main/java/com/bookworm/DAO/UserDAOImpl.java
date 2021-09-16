package com.bookworm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookworm.entity.UserTable;
import com.bookworm.repository.UserRepositary;


@Component
public class UserDAOImpl implements UserDAO {

	@Autowired
	UserRepositary userRepo;


	@Override
	public List<UserTable> getallUser() {
		return this.userRepo.findAll();
	}


	@Override
	public UserTable getUserById(Integer id) {

		return this.userRepo.getById(id);
	}


	@Override
	public UserTable saveUser(UserTable user) {
		return this.userRepo.save(user);
	}


	@Override
	public UserTable updateUser(UserTable user) {
		return this.userRepo.save(user);
	}


	@Override
	public String deleteUserById(Integer id) {
		if(this.userRepo.existsById(id)){
			this.userRepo.deleteById(id);
			return "User DELTED";
		}
			
		
		return "OBJECT/ ID NOT FOUND TO DELETE";
	}
}
