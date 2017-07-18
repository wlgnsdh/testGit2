package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test01 {
	
	private String testPrint() {
		// TODO Auto-generated method stub
		
		return "HelloWorld";

	}
	
	
	
	@RequestMapping("/")
	public String index() {
		return "helloworld!";
	}
	
	@RequestMapping("/index")
	public String index2() {
		return "helloworld22!";
	}

}
