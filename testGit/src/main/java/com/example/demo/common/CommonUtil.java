package com.example.demo.common;

public class CommonUtil {

	private static String def = "Hello! ";
	
	
	public static String retHellow(String gub ) {
		// TODO Auto-generated method stub

		String ret = "Hello! ";
		
		if(null != gub && !"".equals(gub)){
			ret = def + " : " + gub;
		}
		return ret;
	}
	
}
