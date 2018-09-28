package me.shijunjie.SimpleUserServer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.shijunjie.SimpleUserServer.entity.User;
import me.shijunjie.SimpleUserServer.entity.UserExample;
import me.shijunjie.SimpleUserServer.mapper.UserMapper;
import me.shijunjie.SimpleUserServer.request.UserRequest;
import me.shijunjie.SimpleUserServer.response.BaseResponse;
import me.shijunjie.SimpleUserServer.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int testInsert(User user) {
		return userMapper.insert(user);
	}

	@Override
	public BaseResponse login(UserRequest request) {
		UserExample wheres = new UserExample();
		wheres.createCriteria().andUserNameEqualTo(request.getUserName())
		.andPasswordEqualTo(request.getPassWord());
		List<User> users = userMapper.selectByExample(wheres);
		if(users != null && users.size() > 0) {
			return BaseResponse.ok("SUCCESS");
		}
		return BaseResponse.ok("FAIED");
	}

}
