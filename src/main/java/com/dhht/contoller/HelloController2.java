package com.dhht.contoller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhht.pojo.JsonResult;
import com.dhht.pojo.User;

@RestController
@RequestMapping("/user1")     // @RestController = @Controller+@ResponseBody
public class HelloController2 {

	@RequestMapping("/getUser11")
	//@ResponseBody  //转成json格式传到后台
	public User hello() {
		User user = new User();
		user.setAge(12);
		user.setBirthday(new Date());
		user.setName("老王");
		user.setPassword("123");
		return user;
	}
	
	@RequestMapping("/getUserJson1")
	//@ResponseBody  //转成json格式传到后台
	public JsonResult getUserJson() {
		User user = new User();
		user.setAge(12);
		user.setBirthday(new Date());
		user.setName("老王");
		user.setPassword("123");
		return JsonResult.ok(user);
	}
}
