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
	
	
	
	@RequestMapping("/indexT021")
	public String indexT021() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub = "021";
		
		return testPrint(gub);
	}
	
	@RequestMapping("/indexT022")
	public String indexT022() {
		
		if(!isChk2){
			isChk2 = true;
		}
		
		gub = "022";
		
		return testPrint(gub);
	}
	
	@RequestMapping("/indexT023")
	public String indexT023() {


		gub = "023";
		
		return testPrint(gub);
	}
	
	@RequestMapping("/indexT024")
	public String indexT4() {
		
		gub = "024";
		
		return testPrint(gub);
	}
}
