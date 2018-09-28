package me.shijunjie.SimpleUserServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.shijunjie.SimpleUserServer.request.UserRequest;
import me.shijunjie.SimpleUserServer.response.BaseResponse;
import me.shijunjie.SimpleUserServer.service.UserService;

@Api(value = "UserController", hidden = false, description = "UserController")
@RestController
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	private UserService userService;

	@ApiOperation(value = "/login", httpMethod = "GET", notes = "登录")
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public BaseResponse login(UserRequest request) {
		return userService.login(request);
	}

}
