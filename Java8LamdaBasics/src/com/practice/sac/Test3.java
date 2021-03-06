package com.practice.sac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
class Employee1 {

	private int id;
	private String name;
	private double salary;
	private List<String> citiesWorkedIn;

}

public class Test3 {

	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<>();
		list.add(new Employee1(1, "Sachin Tendulkar", 5000, new ArrayList<String>(Arrays.asList("Pune", "Indore"))));
		list.add(new Employee1(2, "Sachin Chourasiya", 4000,
				new ArrayList<String>(Arrays.asList("Pune", "Indore", "Banglore"))));
		list.add(
				new Employee1(3, "Vipin Jain", 4000, new ArrayList<String>(Arrays.asList("Pune", "Indore", "Mumbai"))));
		list.add(new Employee1(4, "Yashi Jain", 2000,
				new ArrayList<String>(Arrays.asList("Pune", "Indore", "Banglore"))));

		Predicate<Employee1> p1 = e -> e.getName().startsWith("Sachin");
		Predicate<Employee1> p2 = e -> e.getCitiesWorkedIn().contains("Pune");
		Predicate<Employee1> p3 = e -> e.getSalary() > 3000;

		List<Employee1> list1 = list.stream().filter(p1.and(p2).and(p3)).collect(Collectors.toList());
		System.out.println("LIST "+list1);
		Map<Integer, Employee1> map1 =
		 list.stream().filter(p1.and(p2).and(p3)).collect(Collectors.toMap(Employee1::getId, Function.identity()));
		
		System.out.println("MAP1 "+map1);
		
		Map<String, Employee1> map2 =
				 list.stream().filter(p1.and(p2).and(p3)).collect(Collectors.toMap(Employee1::getName, Function.identity()));
		
		System.out.println("MAP2 "+map2);

		/*Map<Integer, Employee1> map = new HashMap<Integer, Employee1>();
		for (Employee1 emp : list1){
			
			map.put(emp.getId(),emp);
		}
		System.out.println(map);*/
		
		
	}

}
