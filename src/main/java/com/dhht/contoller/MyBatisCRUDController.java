package com.dhht.contoller;

import java.util.Date;
import java.util.List;

import org.n3r.idworker.Sid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhht.pojo.IMoocJSONResult;
import com.dhht.pojo.SysUser;
import com.dhht.pojo.User;
import com.dhht.service.UserService;

@RestController
@RequestMapping("mybatis")
public class MyBatisCRUDController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private Sid sid;
	
	@RequestMapping("/saveUser")
	public IMoocJSONResult saveUser() throws Exception {
		
		String userId = sid.nextShort();
		SysUser user = new SysUser();
		user.setId(userId);
		user.setName("张三");
		user.setAge(12);
		userService.saveUser(user);
		return IMoocJSONResult.ok("保存成功");
	}
	
	@RequestMapping("/updateUser")
	public IMoocJSONResult updateUser(SysUser sysUser) {
		//SysUser user =  userService.queryUserById(sysUser.getId());
		SysUser user =  userService.queryUserByIdCustom(sysUser.getId());
        System.out.println(user.getName());
        user.setAge(sysUser.getAge());
		userService.updateUser(user);
		return IMoocJSONResult.ok("保存成功");
	}
	
	@RequestMapping("/deleteUser")
	public IMoocJSONResult deleteUser(String userId) {
		userService.deleteUser(userId);
		return IMoocJSONResult.ok("删除成功");
	}
	
	@RequestMapping("/queryUserById")
	public IMoocJSONResult queryUserById(String userId) {
		
		return IMoocJSONResult.ok(userService.queryUserById(userId));
	}
	
	@RequestMapping("/queryUserList")
	public IMoocJSONResult queryUserList() {
		
		SysUser user = new SysUser();
		
		List<SysUser> userList = userService.queryUserList(user);
		
		return IMoocJSONResult.ok(userList);
	}
	
	@RequestMapping("/queryUserListPaged")
	public IMoocJSONResult queryUserListPaged(Integer page) {
		
		if (page == null) {
			page = 1;
		}

		int pageSize = 10;
		
		SysUser user = new SysUser();
//		user.setNickname("lee");
		
		List<SysUser> userList = userService.queryUserListPaged(user, page, pageSize);
		
		return IMoocJSONResult.ok(userList);
	}
	
	@RequestMapping("/queryUserByIdCustom")
	public IMoocJSONResult queryUserByIdCustom(String userId) {
		
		return IMoocJSONResult.ok(userService.queryUserByIdCustom(userId));
	}
	
	@RequestMapping("/saveUserTransactional")
	public IMoocJSONResult saveUserTransactional() {
		
		String userId = sid.nextShort();
		
		SysUser user = new SysUser();
		user.setId(userId);
		userService.saveUserTransactional(user);
		
		return IMoocJSONResult.ok("保存成功");
	}
}
