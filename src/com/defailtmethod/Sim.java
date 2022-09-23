package com.defailtmethod;

public interface Sim {

	public abstract void call();
	
	public abstract void sms();
	
	public default void videoCall() {
		System.out.println("video call is implemented");
	}
}
