package com.dhht.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhht.pojo.IMoocJSONResult;


@Controller
@RequestMapping("err")
public class ErrorController {
	
	 @RequestMapping("/error")
	  public String error() {
		    int a = 1/0;
		    return  "thymeleaf/error";
	  }
	 
	 @RequestMapping("/ajaxerror")
		public String ajaxerror() {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			return "thymeleaf/ajaxerror";
		}
	 
	 @RequestMapping("/getAjaxerror")
		@ResponseBody
		public IMoocJSONResult getAjaxerror() {
			int a = 1 / 0;
			System.out.println("############@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			return IMoocJSONResult.ok();
		}
}
