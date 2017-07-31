package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController01 {
	
	private boolean isChk = false;
	
	private boolean isChk2 = false;
	
	private String gub1 = "";
	
	private String testPrint(String gub) {
		// TODO Auto-generated method stub
		
		return "HelloWorld : " + gub + "!!!";

	}
	
	
	
	@RequestMapping("/test11")
	public String index1() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub1 = "11";
		
		return testPrint(gub1);
	}
	
	
	@RequestMapping("/test12")
	public String index2() {
		
		if(!isChk2){
			isChk2 = true;
		}
		
		gub1 = "22";
		
		return testPrint(gub1);
	}
	
	@RequestMapping("/test13")
	public String index3() {


		gub1 = "33";
		
		return testPrint(gub1);
	}
	
	@RequestMapping("/test14")
	public String index4() {
		
		gub1 = "44";
		
		return testPrint(gub1);
	}
}
