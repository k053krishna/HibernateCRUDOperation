package com.stramapi.interbate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFelterObject {

	private static List<Product> getProductList() {
		List<Product> listOfProduct = new ArrayList<Product>();
		listOfProduct.add(new Product(10, "Dell", 40000));
		listOfProduct.add(new Product(20, "HP", 30000));
		listOfProduct.add(new Product(30, "Apple", 90000));
		listOfProduct.add(new Product(40, "Lenivo", 45000));
		return listOfProduct;
	}

	public static void main(String[] args) {
		List<Product> list1 = new ArrayList<Product>();
		for (Product product : getProductList()) {
			if (product.getPrice() > 40000) {
				list1.add(product);
			}
		}
		for (Product pro : list1) {
			System.out.println(pro);
			
		}
		System.out.println("....................................");

		List<Product> al1 = getProductList()
				.stream().filter((Product) -> Product.getPrice() > 40000)
				.collect(Collectors.toList());
		al1.forEach(System.out::println);


		 getProductList().stream()
		 .filter((Product) -> Product.getPrice() > 40000).
		 forEach(System.out::println);
	}
	
}
