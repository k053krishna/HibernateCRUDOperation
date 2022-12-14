package com.stramapi.interbate;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class ForEachLoopInHashSet {

	public static void main(String[] args) {
		
		Set<Person> person=new HashSet<Person>();
		
		person.add(new Person("krishna", 40));
		person.add(new Person("Viaksh", 45));
		person.add(new Person("rahul", 50));
		person.add(new Person("nilesh", 48));
		
		person.forEach(System.out::println);
		
		person.stream().forEach((Person)->{System.out.println(Person.getName());
		System.out.println(Person.getAge());});
	}
}

class Person{
	private String name;
	private int age;
		
	public Person(String name, int age) {
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
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}