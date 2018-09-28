package me.shijunjie.SimpleUserServer.service;

import me.shijunjie.SimpleUserServer.entity.User;
import me.shijunjie.SimpleUserServer.request.UserRequest;
import me.shijunjie.SimpleUserServer.response.BaseResponse;

public interface UserService {
	int testInsert(User user);

	BaseResponse login(UserRequest request);
}
