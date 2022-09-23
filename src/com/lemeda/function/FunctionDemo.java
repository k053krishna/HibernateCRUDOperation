package com.lemeda.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		/*
		Function<String ,Integer> function=new FunctionImpl();
		System.out.println(Function.apply("Remesh"));
		*/
		Function<String, Integer> function= (String s)->s.length();
		System.out.println(function.apply( "Raesh"));
		
	}
}
