package com.niit.ecommersprojectbackend.dao;

import java.util.List;

import com.niit.ecommersprojectbackend.model.User;


public interface UserDAO {


	public  boolean register(User user);
	
	public boolean update(User user);
	
	public boolean validate(String id, String password);
	
	public List<User> list();
	
	public User get(String id);
	
	
	
}
