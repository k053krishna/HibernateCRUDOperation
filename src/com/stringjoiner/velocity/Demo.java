package com.stringjoiner.velocity;

import java.util.StringJoiner;

public class Demo {

	public static void main(String[] args) {
		
		StringJoiner stringJoiner=new StringJoiner(",");
		stringJoiner.add("krishna");
		stringJoiner.add("Rakesh");
		stringJoiner.add("roshan");
		System.out.println(stringJoiner);
		
		
	}
}
