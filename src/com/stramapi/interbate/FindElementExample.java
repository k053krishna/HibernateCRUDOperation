package com.stramapi.interbate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElementExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 34, 5, 6, 1);

		// findFirst() and findAny() method

		Optional<Integer> element = list.stream().findFirst();
		if (element.isPresent()) {
			System.out.println(element.get());

		} else {
			System.out.println("Steram is empty");
		}
		
		Optional<Integer> element1 = list.stream().findAny();
		
		if (element1.isPresent()) {
			System.out.println(element1.get());
		} else {
			System.out.println("stream is empty");
		}

	}
}
