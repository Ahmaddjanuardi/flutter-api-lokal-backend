package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface IUserService {

	public User insertUserCreate(User user);
	
	public List<User> getAllUser();
	
	public User deleteUser(int id);
	
	public User updateUser(int id, User user);
	
	public User getUser(int id);
}
