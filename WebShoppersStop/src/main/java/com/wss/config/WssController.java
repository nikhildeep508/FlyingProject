package com.wss.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WssController {
	
	@RequestMapping(value="/")
	public String showIndex(Model model) {
		System.out.println("Inside showIndex()");
		return "index";
	}

}
