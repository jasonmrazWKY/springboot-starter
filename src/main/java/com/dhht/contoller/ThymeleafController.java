package com.dhht.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("th")
public class ThymeleafController {
        
	@RequestMapping("/index")
	public  String  index(ModelMap m) {
		m.addAttribute("name", "DHHT");
		return  "thymeleaf/index";
	}
	
	@RequestMapping("/center")
	public String center() {
		return  "thymeleaf/center/center";
	}
}
