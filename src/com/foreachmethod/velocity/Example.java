package com.foreachmethod.velocity;

import java.util.HashMap;
import java.util.Map;

public class Example {

	//Desine a HashMap <String,String>
	public static void main(String[] args) {
		Map<String ,String> map=new HashMap<String ,String>();
		map.put("10","karishna");
		map.put("20", "rakesh");
		map.put("30", "arun");
	
		map.forEach((k,v) -> System.out.println("key is " +k +" value is "+v));
	}
}
