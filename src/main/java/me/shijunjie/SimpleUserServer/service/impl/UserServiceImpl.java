package me.shijunjie.SimpleUserServer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.shijunjie.SimpleUserServer.entity.User;
import me.shijunjie.SimpleUserServer.mapper.UserMapper;
import me.shijunjie.SimpleUserServer.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int testInsert(User user) {
		return userMapper.insert(user);
	}

}
