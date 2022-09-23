package com.defaultmethod.velocity;

public interface Demo {

	default void getDisplayData() {
		System.out.println("this is default getDisplayData method");
	}
	
	public static void getData() {
		System.out.println("this is getData method");
	}
}
