package com.stramapi.interbate;

import java.util.ArrayList;
import java.util.List;

public class ListOfForEachExample {

	public static void main(String[] args) {

		List<User> list=new ArrayList<User>();
		list.add(new User("krishna", 22));
		list.add(new User("Vaikash", 26));
		list.add(new User("roshan", 27));
		list.add(new User("laxman", 29));
		
		list.forEach(System.out::println);
		
		list.forEach((User) ->{System.out.println(User.getName());
		System.out.println(User.getAge());
		});
		System.out.println(".............");
		list.stream().forEach((User)->{System.out.println(User.getName());
		System.out.println(User.getAge());
		});
	}
}


class User {
	private String name;
	private int age;
		
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}