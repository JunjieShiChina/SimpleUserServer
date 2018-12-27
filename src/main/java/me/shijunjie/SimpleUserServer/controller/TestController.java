package me.shijunjie.SimpleUserServer.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.shijunjie.SimpleUserServer.entity.User;
import me.shijunjie.SimpleUserServer.response.BaseResponse;
import me.shijunjie.SimpleUserServer.service.UserService;

@Api(value = "测试", hidden = false, description = "测试")
@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private UserService userService;
	
	@ApiOperation(value = "/ipAddress", httpMethod = "GET")
	@RequestMapping(value = "/ipAddress", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public BaseResponse ipAddress() throws UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();
		return BaseResponse.ok("other:"+addr.getHostAddress());
	}

	@ApiOperation(value = "/testInsert", httpMethod = "GET")
	@RequestMapping(value = "/testInsert", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public BaseResponse testInsert() {
		User user = new User();
		user.setUserName("test");
		userService.testInsert(user);
		return new BaseResponse(200, "SUCCESS");
	}

}
