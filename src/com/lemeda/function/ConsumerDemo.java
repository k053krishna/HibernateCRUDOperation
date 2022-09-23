package com.lemeda.function;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
      /*
		Consumer<String> consumer=new ConsumerImpl();
		consumer.accept("hellow word");
		*/
	Consumer<String> consumer=(input)->System.out.println(input);
	consumer.accept("hellow word");
	}
}
