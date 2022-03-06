package com.sac.collectionsframework.set;

import java.util.Comparator;
import java.util.TreeSet;

/*Write a program to insert employee objects into the TreeSet
 *where default natural sorting is ascending order of the salaries
 *.If two employees having the same salary then consider alphabetical
 *orders of their names, and write a comparator class to define customized
 *sorting which is alphabetical order of employee names, if two employees 
 *having same name then consider descending order of their age*/
class Employee1 implements Comparable {
	String ename;
	int esalary;
	int eage;

	Employee1(String ename, int esalary, int eage) {
		this.ename = ename;
		this.esalary = esalary;
		this.eage = eage;

	}

	public String toString() {
		return ename + ".." + esalary + ".." + eage;
	}

	@Override
	public int compareTo(Object o) {
		int esal1 = this.esalary;
		String ename1 = this.ename;
		Employee1 e = (Employee1) o;
		int esal2 = e.esalary;
		String ename2 = e.ename;

		if (esal1 < esal2) {
			return -1;
		} else if (esal1 > esal2) {
			return +1;
		} else {
			return ename1.compareTo(ename2);
		}

	}

}

class MyComparator6 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee1 e1 = (Employee1) o1;
		Employee1 e2 = (Employee1) o2;
		String ename1 = e1.ename;
		String ename2 = e2.ename;
		int eage1 = e1.eage;
		int eage2 = e2.eage;
		return ename1.compareTo(ename2);

		/*
		 * if (ename1.equals(ename2)) { if (eage1 > eage2) { return -1; } else
		 * if (eage1 < eage2) { return +1; } } else { return
		 * ename1.compareTo(ename2); }
		 */
	}

}

public class TreeSetEmployeeExerciseDemo {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1("Sachin", 50000, 28);
		Employee1 e2 = new Employee1("Abhishek", 60000, 27);
		Employee1 e3 = new Employee1("Vipin", 70000, 29);
		Employee1 e4 = new Employee1("Raja", 100000, 30);
		Employee1 e5 = new Employee1("Yashi", 200000, 26);
		Employee1 e6 = new Employee1("Yashi", 300000, 31);

		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		System.out.println(t);
		TreeSet t1 = new TreeSet(new MyComparator6());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);
		System.out.println(t1);
	}

}
