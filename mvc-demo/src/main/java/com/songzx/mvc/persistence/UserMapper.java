package com.songzx.mvc.persistence;

import java.util.List;

import com.songzx.mvc.domain.User;

public interface UserMapper {
	
	public void addUser(User user);
	
	public void deleteUser(User user);
	
	public void updateUser(User user);
	
	public User getUserByName(String name);
	
	public List<User> getAllUsers();
}
