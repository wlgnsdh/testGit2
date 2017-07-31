package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController02 {
	
	private boolean isChk = false;
	
	private boolean isChk2 = false;
	
	private String gub2 = "";
	
	private String testPrint(String gub) {
		// TODO Auto-generated method stub
		
		return "HelloWorld test4 s : " + gub + "!!";

	}
	
	
	
	@RequestMapping("/test21")
	public String indexT1() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub2 = "1";
		
		return testPrint(gub2);
	}
	
	@RequestMapping("/test22")
	public String indexT2() {
		
		if(!isChk2){
			isChk2 = true;
		}
		
		gub2 = "2";
		
		return testPrint(gub2);
	}
	
	@RequestMapping("/test23")
	public String indexT3() {


		gub2 = "3";
		
		return testPrint(gub2);
	}
	
	@RequestMapping("/test24")
	public String indexT4() {
		
		gub2 = "4";
		
		return testPrint(gub2);
	}
}
