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
	
	
	
	@RequestMapping("/11")
	public String i11() {
		
		if(!isChk){
			isChk = true;
		}
		
		return "helloworld!" + isChk;
	}
	
	@RequestMapping("/22")
	public String i22() {
		
		if(!isChk2){
			isChk2 = true;
		}
		
		return "helloworld22!";
	}
	
	@RequestMapping("/33")
	public String i33() {
		return "helloworld33!";
	}
	
	@RequestMapping("/44")
	public String i44() {
		return "helloworld44!";
	}

}
