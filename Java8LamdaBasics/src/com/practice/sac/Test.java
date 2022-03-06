package com.practice.sac;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {

	private String name;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}

public class Test {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(list);
		// Print Odd no.s
		List<Integer> oddList = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println(oddList);
		List<Integer> newList = list.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(newList);

		List<Integer> list1 = Arrays.asList(33, 12, 55, 44, 15, 6, 17, 8, 19, 10);
		List<Integer> list1Asc = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(list1Asc);

		List<Integer> list1Desc = list1.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());

		System.out.println(list1Desc);

		List<Employee> listEmp = Arrays.asList(new Employee("sachin", 40000), new Employee("Prashant", 50000),
				new Employee("KK", 20000));
		// Print the employees who's salary is greater than 35000;

		List<Employee> sortedList = listEmp.stream().filter(e -> e.getSalary() >= 35000).collect(Collectors.toList());

		System.out.println(sortedList);

		List<Integer> list2 = Arrays.asList(33, 12, 55, 44, 15, 6, 17, 8, 19, 10);

		int sum = list2.stream().sorted().limit(2).reduce((i1, i2) -> (i1 + i2)).get();
		int sum1 = list2.stream().sorted((a, b) -> b.compareTo(a)).limit(2).reduce((i1, i2) -> (i1 + i2)).get();
		System.out.println(sum);
		System.out.println(sum1);

		Map<String, Integer> map = listEmp.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
		System.out.println(map);
		
		

	}

}
