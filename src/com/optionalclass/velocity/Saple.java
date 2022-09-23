package com.optionalclass.velocity;

import java.util.Optional;

public class Saple {

	public static void main(String[] args) {
		
		String [] s=new String [5];
		
		Optional<String> a=Optional.ofNullable(s.clone()[3]);
		
		
		if(a.isPresent()) {
			String lower= s[3].toLowerCase();
			System.out.println(lower);
	}else {
		System.out.println("value is not present");
	}
	}
}
 