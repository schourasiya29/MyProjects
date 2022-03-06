package com.sac.collectionsframework.set;

import java.util.Comparator;
import java.util.TreeSet;

/*If we want default natural sorting for Employee 
 *i.e. based on employee id we will implement comparable
 *in the employee class*/
class Employee implements Comparable {
	String ename;
	int eid;

	Employee(String ename, int eid) {
		this.ename = ename;
		this.eid = eid;
	}

	public String toString() {
		return ename + "...." + eid;

	}

	@Override
	public int compareTo(Object o) {
		int eid1 = this.eid;
		Employee e = (Employee) o;
		int eid2 = e.eid;

		if (eid1 < eid2) {
			return -1;
		} else if (eid1 > eid2) {
			return +1;
		} else {
			return 0;
		}

	}

}

/*
 * If we don't want the default natural sorting of Employee class and we want
 * sorting based on the names of the Employee then we will go with comparator
 * concept
 */
class MyComparator5 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		String s1 = e1.ename;
		String s2 = e2.ename;
		return s1.compareTo(s2);
	}

}

public class TreeSetComparableAndComparatorDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("Sachin", 100);
		Employee e2 = new Employee("Sonu", 104);
		Employee e3 = new Employee("Abhishek", 105);
		Employee e4 = new Employee("JD", 102);
		Employee e5 = new Employee("Vipin", 101);
		Employee e6 = new Employee("Vipin", 101);

		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		System.out.println(t);
		
		TreeSet t1 = new TreeSet(new MyComparator5());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);
		System.out.println(t1);
	}

}
