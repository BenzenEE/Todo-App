package com.sayan.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sayan.entity.User;
import com.sayan.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	@Override
	public User saveUser(User newUser) {
		return userRepo.save(newUser);
	}
	@Override
	public List<User> allUsers() {
		return userRepo.findAll();
	}
	@Override
	public User specificUser(Long id) {
		return userRepo.findById(id).get();
	}
	@Override
	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}
	@Override
	public User updateUser(Long id, User user) {
		User updatedUser = userRepo.findById(id).get();
		
		if(Objects.nonNull(user.getName()) && !"".equalsIgnoreCase(user.getName())) {
			updatedUser.setName(user.getName());
		}
		if(Objects.nonNull(user.getEmail()) && !"".equalsIgnoreCase(user.getEmail())) {
			updatedUser.setEmail(user.getEmail());
		}
		if(Objects.nonNull(user.getAddress()) && !"".equalsIgnoreCase(user.getAddress())) {
			updatedUser.setAddress(user.getAddress());
		}
		
		return userRepo.save(updatedUser);
	}

}
