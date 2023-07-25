package com.sayan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sayan.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
