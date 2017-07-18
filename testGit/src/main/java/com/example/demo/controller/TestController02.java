package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController02 {
	
	private boolean isChk = false;
	
	private boolean isChk2 = false;
	
	private String gub = "";
	
	private String testPrint(String gub) {
		// TODO Auto-generated method stub
		
		return "HelloWorld test4 : " + gub + "!!";

	}
	
	
	
	@RequestMapping("/indexT1")
	public String indexT1() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub = "1";
		
		return testPrint(gub);
	}
	
	@RequestMapping("/indexT2")
	public String indexT2() {
		
		if(!isChk2){
			isChk2 = true;
		}
		
		gub = "2";
		
		return testPrint(gub);
	}
	
	@RequestMapping("/indexT3")
	public String indexT3() {


		gub = "3";
		
		return testPrint(gub);
	}
	
	@RequestMapping("/indexT4")
	public String indexT4() {
		
		gub = "4";
		
		return testPrint(gub);
	}
}
