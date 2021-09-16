package com.bookworm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entity.UserTable;
import com.bookworm.service.UserService;


@RestController
public class UserController {

	@Autowired
	UserService UserSer;

	@GetMapping("/user/all")
	public List<UserTable> getAllUser(){
		return this.UserSer.getallUser();
	}
	
	@GetMapping("/user/{id}")
	public UserTable getUserById(@PathVariable("id") Integer id) {
		return this.UserSer.getUserById(id);
	}
	
	
	@PostMapping("/user")
	public UserTable saveUser( @RequestBody UserTable user) {
			return this.UserSer.saveUser(user);
	}
	
	
	@PutMapping("/user")
	public UserTable updateUser( @RequestBody UserTable user) {
			return this.UserSer.updateUser(user);
	}
	
	
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable("id") Integer id) {
		return this.UserSer.deleteUserById(id);
	}
	
	
}
