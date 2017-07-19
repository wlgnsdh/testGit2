package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController03 {
	
	private boolean isChk = false;
	
	private boolean isChk2 = false;
	
	private String gub = "";
	
	private String testPrint(String gub) {
		// TODO Auto-generated method stub
		
		return "HelloWorld test3 : " + gub + "!!";

	}
	
	
	
	@RequestMapping("/indexT11")
	public String indexT11() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub = "111";
		
		return testPrint(gub);
	}
	
	@RequestMapping("/indexT22")
	public String indexT22() {
		
		if(!isChk2){
			isChk2 = true;
		}
		
		gub = "222";
		
		return testPrint(gub);
	}
	
	@RequestMapping("/indexT33")
	public String indexT33() {


		gub = "333";
		
		return testPrint(gub);
	}
	
	@RequestMapping("/indexT44")
	public String indexT44() {
		
		gub = "444";
		
		return testPrint(gub);
	}
}
