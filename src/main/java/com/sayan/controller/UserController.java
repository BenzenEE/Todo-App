package com.sayan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sayan.entity.User;
import com.sayan.service.UserService;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User newUser) {
		return userService.saveUser(newUser);
	}
	
	@GetMapping("/users")
	public List<User> allUsers(){
		return userService.allUsers();
	}
	
	@GetMapping("/users/id/{id}")
	public User specificUser(@PathVariable("id") Long id) {
		return userService.specificUser(id);
	}
	
	@DeleteMapping("/users/id/{id}")
	public String deleteUser(@PathVariable("id") Long id) {
		userService.deleteUser(id);
		return "User Deleted Successfully!!";
	}
	
	@PutMapping("/users/id/{id}")
	public User updateUser(@PathVariable("id") Long id, @RequestBody User user) {
		return userService.updateUser(id,user);
	}
}
