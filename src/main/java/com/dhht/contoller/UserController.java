package com.dhht.contoller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhht.pojo.JsonResult;
import com.dhht.pojo.User;

/**
 * 正常springMVC中的写法
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUser")
	@ResponseBody  //转成json格式传到后台
	public User hello() {
		User user = new User();
		user.setAge(12);
		user.setBirthday(new Date());
		user.setName("老王");
		user.setPassword("123");
		return user;
	}
	
	@RequestMapping("/getUserJson")
	@ResponseBody  //转成json格式传到后台
	public JsonResult getUserJson() {
		User user = new User();
		user.setAge(12);
		user.setBirthday(new Date());
		user.setName("老王1");
		user.setPassword("123");
		return JsonResult.ok(user);
	}
}
