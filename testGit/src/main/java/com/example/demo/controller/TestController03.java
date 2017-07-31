package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController03 {
	
	private boolean isChk = false;
	
	private boolean isChk2 = false;
	
	private String gub3 = "";
	
	private String testPrint(String gub) {
		// TODO Auto-generated method stub
		
		return "HelloWorld test3 : " + gub3 + "!!";

	}
	
	
	
	@RequestMapping("/test31")
	public String indexT11() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub3 = "111";
		
		return testPrint(gub3);
	}
	
	@RequestMapping("/test32")
	public String indexT22() {
		
		if(!isChk2){
			isChk2 = true;
		}
		
		gub3 = "222";
		
		return testPrint(gub3);
	}
	
	@RequestMapping("/test33")
	public String indexT33() {


		gub3 = "333";
		
		return testPrint(gub3);
	}
	
	@RequestMapping("/test34")
	public String indexT44() {
		
		gub3 = "444";
		
		return testPrint(gub3);
	}
}
