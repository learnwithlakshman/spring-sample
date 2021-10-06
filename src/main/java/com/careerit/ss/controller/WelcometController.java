package com.careerit.ss.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class WelcometController {

		@RequestMapping("hello")
		public String index() {
			return "Welcome to java world";
		}
}
