package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.CommonUtil;

@RestController
public class MainController5 {
	
	private boolean isChk = false;
	
	private boolean isChk2 = false;
	
	private String gub = "";
	
	private String testPrint(String gub) {
		// TODO Auto-generated method stub
		
		return "HelloWorld : " + gub + "!!!";

	}
	
	@RequestMapping("/main51")
	public String main51() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub = "main51";
		
		return CommonUtil.retHellow(gub);
	}
	
	
}
