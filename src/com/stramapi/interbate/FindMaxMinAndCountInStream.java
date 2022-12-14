package com.stramapi.interbate;

import java.util.Comparator;
import java.util.stream.Stream;

public class FindMaxMinAndCountInStream {

	public static void main(String[] args) {
		
		//count(),min(),and max() method
		
		Stream<Integer> stream=Stream.of(1,2,3,4,5,6,7,8,9);
		System.out.println(stream.count());
		
		Stream<Integer>stream1=Stream.of(1,2,3,4,5,6,7,8,9);
		System.out.println(stream1.min(Comparator.comparing(Integer::valueOf)).get());
		
		Stream<Integer>stream2=Stream.of(1,2,3,4,5,6,7,8,9);
		System.out.println(stream2.max(Comparator.comparing(Integer::valueOf)).get());
		
	}
}
