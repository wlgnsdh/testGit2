package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.CommonUtil;

@RestController
public class MainController6 {
	
	private boolean isChk = false;
	
	private boolean isChk2 = false;
	
	private String gub = "";
	
	private String testPrint(String gub) {
		// TODO Auto-generated method stub
		
		return "HelloWorld : " + gub + "!!!";

	}
	
	@RequestMapping("/main61")
	public String main61() {
		
		if(!isChk){
			isChk = true;
		}
		
		gub = "main61";
		
		return CommonUtil.retHellow(gub);
	}
	
	
}
