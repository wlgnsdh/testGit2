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
	
	
	
	@RequestMapping("/index11")
	public String index11() {
		
		if(!isChk){
			isChk = true;
		}
		
		return "helloworld11!" + isChk;
	}
	
	@RequestMapping("/index12")
	public String index12() {
		
		if(!isChk2){
			isChk2 = true;
		}
		
		return "helloworld12!";
	}
	
	@RequestMapping("/index13")
	public String index13() {
		return "helloworld13!";
	}
	
	@RequestMapping("/index14")
	public String index14() {
		return "helloworld14!";
	}

}
