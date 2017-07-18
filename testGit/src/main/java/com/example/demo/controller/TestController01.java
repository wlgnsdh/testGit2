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
		
		return "HelloWorld : " + gub + "!!";

	}
	
	
	
	@RequestMapping("/index1")
	public String index1() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub = "1";
		
		return testPrint(gub);
	}
	
	@RequestMapping("/index2")
	public String index2() {
		
		if(!isChk2){
			isChk2 = true;
		}
		
		gub = "2";
		
		return testPrint(gub);
	}
	
	@RequestMapping("/index3")
	public String index3() {


		gub = "3";
		
		return testPrint(gub);
	}
	
	@RequestMapping("/index4")
	public String index4() {
		
		gub = "4";
		
		return testPrint(gub);
	}
}
