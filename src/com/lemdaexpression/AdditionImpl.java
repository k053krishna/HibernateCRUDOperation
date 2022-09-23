package com.lemdaexpression;

public class AdditionImpl {

	public static void main(String[] args) {
		
		Addition addition=(x,y)->(x+y);
		System.out.println(addition.add(10, 10));
	}

}
