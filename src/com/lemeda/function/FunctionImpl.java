package com.lemeda.function;

import java.util.function.Function;

public class FunctionImpl implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		return t.length();
	}


}
