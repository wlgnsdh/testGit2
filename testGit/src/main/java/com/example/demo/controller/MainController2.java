package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.CommonUtil;

@RestController
public class MainController2 {
	
	private boolean isChk = false;
	
	private boolean isChk2 = false;
	
	private String gub = "";
	
	private String testPrint(String gub) {
		// TODO Auto-generated method stub
		
		return "HelloWorld : " + gub + "!!!";

	}
	
	
	
	@RequestMapping("/main21")
	public String main21() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub = "main21";
		
		return CommonUtil.retHellow(gub);
	}
	
	@RequestMapping("/main22")
	public String main22() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub = "main22";
		
		return CommonUtil.retHellow(gub);
	}
	
	
}
