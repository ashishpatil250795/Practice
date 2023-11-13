package com.study.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.models.User;

@Controller
@RequestMapping("/usr")
public class WebController {
	
		@GetMapping    
		public String simple(@RequestAttribute User user) {
			return "aaaaaaa";
		}
}
