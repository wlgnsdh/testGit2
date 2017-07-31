package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController04 {
	
	private boolean isChk = false;
	
	private boolean isChk2 = false;
	
	private String gub4 = "";
	
	private String testPrint(String gub) {
		// TODO Auto-generated method stub
		
		return "HelloWorld test3 : " + gub + "!!";

	}
	
	
	
	@RequestMapping("/indexT41")
	public String indexT11() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub4 = "111";
		
		return testPrint(gub4);
	}
	
	@RequestMapping("/indexT42")
	public String indexT22() {
		
		if(!isChk2){
			isChk2 = true;
		}
		
		gub4 = "222";
		
		return testPrint(gub4);
	}
	
	@RequestMapping("/indexT43")
	public String indexT33() {


		gub4 = "333";
		
		return testPrint(gub4);
	}
	
	@RequestMapping("/indexT44")
	public String indexT44() {
		
		gub4 = "444";
		
		return testPrint(gub4);
	}
}
