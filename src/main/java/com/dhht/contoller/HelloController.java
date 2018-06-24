package com.dhht.contoller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhht.pojo.JsonResult;
import com.dhht.pojo.Resource;

@RestController
@RequestMapping("hello")
public class HelloController {
	
	@Autowired
	private Resource resource;
 
	
	@RequestMapping("hello")
	public Object hello() {
		return "hello springboot 123";
	}
	
	@RequestMapping("/getConfig")
	public  JsonResult  getConfig() {
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		return JsonResult.ok(bean);
	}
	
}
