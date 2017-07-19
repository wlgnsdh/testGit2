package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.CommonUtil;

@RestController
public class MainController1 {
	
	private boolean isChk = false;
	
	private boolean isChk2 = false;
	
	private String gub = "";
	
	private String testPrint(String gub) {
		// TODO Auto-generated method stub
		
		return "HelloWorld : " + gub + "!!!";

	}
	
	@RequestMapping("/main01")
	public String main01() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub = "main01";
		
		return CommonUtil.retHellow(gub);
	}
	
	@RequestMapping("/main02")
	public String main02() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub = "main02";
		
		return CommonUtil.retHellow(gub);
	}
	
	
}
