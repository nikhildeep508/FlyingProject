package com.wss.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WssController {
	
	@RequestMapping(value="/")
	public String showIndex(Model model) {
		System.out.println("Inside showIndex()");
		return "index";
	}
	
	@RequestMapping(value="/hotels.html", method=RequestMethod.GET)
	public String showHotels(Model model) {
		return "hotels";
	}
	
	@RequestMapping(value="/about.html", method=RequestMethod.GET)
	public String showAbout(Model model) {
		return "about";
	}
	
	@RequestMapping(value="/blog.html", method=RequestMethod.GET)
	public String showBlog(Model model) {
		return "blog";
	}

}
