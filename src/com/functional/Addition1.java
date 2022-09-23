package com.functional;

@FunctionalInterface
public interface Addition1 {

	public void add(int a,int b);
	
	public static final int a=10;
	public static final int b=10;
	
	public static class A{}
	public static class B{}	
	
	public default void m1() {}
	public default void m2() {}
	
	public static void m3() {}
	public static void m4() {}
	
	/*
	private static void m5() {}
	private void m6() {}
	public abstract static int hashcode(){}
	public abstract boolean equal(Object obj){}
*/	
}
