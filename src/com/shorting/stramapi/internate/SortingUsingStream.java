package com.shorting.stramapi.internate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingStream {

	public static void main(String[] args) {

		List<String> fruit = new ArrayList<String>();
		fruit.add("Banana");
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("Orange");

		List<String> list1=fruit.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(list1);
      

		List<String> list3=fruit.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(list1);
      

		List<String> list4=fruit.stream().sorted().collect(Collectors.toList());
        System.out.println(list4);
      
        
        List<String> list2=fruit.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list2);
        

		List<String> list5=fruit.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(list5);
      
        //short Employee salary in ascending order
        
        List<Employee> list=new ArrayList<Employee>();
        list.add(new Employee(30, "Ramesh", 400000));
        list.add(new Employee(10, "Krishna", 900000));
        list.add(new Employee(40, "Amit", 500000));
        list.add(new Employee(20, "Vishal", 700000));

        List<Employee> employeelist1=list.stream()
        		.sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary()))
        		.collect(Collectors.toList());
        System.out.println(employeelist1);
        
        List<Employee> employeelist2=list.stream()
        		.sorted((Comparator.comparingLong(Employee::getSalary)))
        		.collect(Collectors.toList());
        System.out.println(employeelist2);
        
        List<Employee> employeelist3=list.stream()
        		.sorted((Comparator.comparingLong(Employee::getId)))
        		.collect(Collectors.toList());
        System.out.println(employeelist3);
        

        List<Employee> employeelist4=list.stream()
        		.sorted((Comparator.comparingLong(Employee::getId).reversed()))
        		.collect(Collectors.toList());
        System.out.println(employeelist4);
        
        List<Employee> employeelist5=list.stream()
        		.sorted((Comparator.comparing(Employee::getName).reversed()))
        		.collect(Collectors.toList());
        System.out.println(employeelist5);
        
        List<Employee> employeelist6=list.stream()
        		.sorted((Comparator.comparing(Employee::getName)))
        		.collect(Collectors.toList());
        System.out.println(employeelist6);
	}
}
