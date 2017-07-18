package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test01 {
	
	private boolean isChk = false;
	
	private boolean isChk2 = false;
	
	private String testPrint() {
		// TODO Auto-generated method stub
		
		return "HelloWorld 3";

	}
	
	
	
	@RequestMapping("/")
	public String index() {
		
		if(!isChk){
			isChk = true;
		}
		
		return "helloworld!" + isChk;
	}
	
	@RequestMapping("/index2")
	public String index2() {
		
		if(!isChk2){
			isChk2 = true;
		}
		
		return "helloworld22!";
	}
	
	@RequestMapping("/index3")
	public String index3() {
		return "helloworld33!";
	}
	
	@RequestMapping("/index4")
	public String index4() {
		return "helloworld44!";
	}

}
