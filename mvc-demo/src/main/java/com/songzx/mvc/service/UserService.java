package com.songzx.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songzx.mvc.domain.User;
import com.songzx.mvc.persistence.UserMapper;

@Service
public class UserService implements UserMapper {
	@Autowired
	private UserMapper userMapper;
	
	public void addUser(User user) {
		userMapper.addUser(user);
	}

	public void deleteUser(User user) {
		userMapper.deleteUser(user);
	}
	
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}
	
	public User getUserByName(String name) {
		return userMapper.getUserByName(name);
	}

	public List<User> getAllUsers() {
		return userMapper.getAllUsers();
	}

}
