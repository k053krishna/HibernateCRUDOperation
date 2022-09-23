package com.lemeda.function;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierImpl implements Supplier<LocalDateTime>{

	@Override
	public LocalDateTime get() {
		return LocalDateTime.now();
	}

}
