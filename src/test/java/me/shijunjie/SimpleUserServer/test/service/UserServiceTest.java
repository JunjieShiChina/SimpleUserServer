//package me.shijunjie.SimpleUserServer.test.service;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import me.shijunjie.SimpleUserServer.BootStrap;
//import me.shijunjie.SimpleUserServer.entity.User;
//import me.shijunjie.SimpleUserServer.service.UserService;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = BootStrap.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class UserServiceTest {
//	
//	@Autowired
//	private UserService userService;
//	
//	@Test
//	public void testUserInsert() {
//		User user = new User();
//		user.setUserName("测试");
//		int cnt = userService.testInsert(user);
//		Assert.assertEquals(cnt, 1);
//	}
//	
//}