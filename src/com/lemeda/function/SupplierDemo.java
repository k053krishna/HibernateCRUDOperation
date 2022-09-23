package com.lemeda.function;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		/*
		Supplier<LocalDateTime> supplier=new SupplierImpl();
		System.out.println(supplier.get());
		*/
		Supplier<LocalDateTime> supplier= ()->LocalDateTime.now();
		System.out.println(supplier.get());
	}
}
