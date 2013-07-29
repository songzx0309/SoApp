package com.songzx.mvc;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.songzx.mvc.service.UserService;

@Controller
public class LoginController {
	private Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(@RequestParam String name, @RequestParam String password, Model model) {
		logger.info("prepare to login in");
		logger.info("name: " + name + "\tpassword: " + password);
		model.addAttribute("name", name);
		model.addAttribute("password", password);
		if(name.equals("songzx") && password.equals("123456")){
			model.addAttribute("result", "success");
			logger.info(userService.getUserByName("j2ee"));
			return "welcome";
		}
		model.addAttribute("result", "failed");
		return "fail";
	}
	
}
