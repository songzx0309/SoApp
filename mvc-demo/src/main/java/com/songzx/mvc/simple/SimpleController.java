package com.songzx.mvc.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

	@RequestMapping(value="/simple")
	public @ResponseBody String getSimple() {
		return "Hello world!";
	}
}
