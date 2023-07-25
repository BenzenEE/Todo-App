package com.sayan.service;

import java.util.List;

import com.sayan.entity.User;

public interface UserService {

	User saveUser(User newUser);

	List<User> allUsers();

	User specificUser(Long id);

	void deleteUser(Long id);

	User updateUser(Long id, User user);

}
