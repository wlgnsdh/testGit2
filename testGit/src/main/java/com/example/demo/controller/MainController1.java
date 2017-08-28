package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.CommonUtil;

@RestController
public class MainController1 {
	
	private boolean isChk = false;
	
	private boolean isChk2 = false;
	
	private String gub = "";
	
	private String gub2 = " gubun2!!";
	
	private String testPrint(String gub) {
		// TODO Auto-generated method stub
		
		return "HelloWorld : " + gub + gub2 + "!!!";

	}
	
	@RequestMapping("/main11")
	public String main11() {
		
		if(!isChk){
			isChk = true;
		}
		if(!isChk){
			isChk = true;
		}
		
		gub = "main11";
		
		return CommonUtil.retHellow(gub);
	}
	
	@RequestMapping("/main12")
	public String main12() {
		
		if(!isChk){
			isChk = true;
		}
		
		if(!isChk){
			isChk = true;
		}
		
		gub = "main12";
		
		return CommonUtil.retHellow(gub);
	}
	
	@RequestMapping("/main13")
	public String main13() {
		
		if(!isChk){
			isChk = true;
		}
		
		if(!isChk){
			isChk = true;
		}
		
		gub = "main13";
		
		return CommonUtil.retHellow(gub);
	}
	
	
}
