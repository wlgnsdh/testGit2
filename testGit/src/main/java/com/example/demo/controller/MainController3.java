package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.CommonUtil;

@RestController
public class MainController3 {
	
	private boolean isChk = false;
	
	private boolean isChk2 = false;
	
	private String gub = "";
	
	private String testPrint(String gub) {
		// TODO Auto-generated method stub
		
		return "HelloWorld : " + gub + "!!!";

	}
	
	@RequestMapping("/main31")
	public String main31() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub = "main31";
		
		return CommonUtil.retHellow(gub);
	}
	
	@RequestMapping("/main32")
	public String main32() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub = "main32";
		
		return CommonUtil.retHellow(gub);
	}
	
	
}
