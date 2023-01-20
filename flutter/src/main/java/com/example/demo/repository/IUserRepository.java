package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.User;

public interface IUserRepository {

	public User insertUserCreate(User user);
	
	public List<User> getAllUser();
	
	public User deleteUser(int id);
	
	public User updateUser(int id, User user);
	
	public User getUser(int id);
}
