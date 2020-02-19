package com.demo.SpringDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Hello world!
 *
 */
@Controller
public class App {
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
}
