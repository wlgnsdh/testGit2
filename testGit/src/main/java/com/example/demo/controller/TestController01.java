package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController01 {
	
	private boolean isChk = false;
	
	private boolean isChk2 = false;
	
	private String gub = "";
	
	private String testPrint(String gub) {
		// TODO Auto-generated method stub
		
		return "HelloWorld : " + gub + "!!!";

	}
	
	
	
	@RequestMapping("/index011")
	public String index011() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub = "011";
		
		return testPrint(gub);
	}
	
	
	@RequestMapping("/index012")
	public String index2() {
		
		if(!isChk2){
			isChk2 = true;
		}
		
		gub = "012";
		
		return testPrint(gub);
	}
	
	@RequestMapping("/index013")
	public String index3() {


		gub = "013";
		
		return testPrint(gub);
	}
	
	@RequestMapping("/index014")
	public String index4() {
		
		gub = "014";
		
		return testPrint(gub);
	}
}
