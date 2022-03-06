package com.sac.collectionsframework.set;

import java.util.Comparator;
import java.util.TreeSet;

/*Various Implementation of compare() method*/
public class TreeSetCustomizedSortingDemo1 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator1());// customized sorting for
													// this constructor
		// TreeSet t = new TreeSet();//Default natural sorting for this
		// constructor
		t.add(10);
		t.add(5);
		t.add(20);
		t.add(4);
		t.add(2);
		t.add(20);
		System.out.println(t);
	}

}

class MyComparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		/*Default sorting i.e Ascending order*/
		return i1.compareTo(i2);
		
		/*Descending order*/
		//return - i1.compareTo(i2);
		
		/*Descending order*/
		//return i2.compareTo(i1);
		
		/*Ascending order*/
		//return -i2.compareTo(i1);
		
		/*insertion order with duplicates*/
		//return +1;

		/*reverse of insertion order with duplicates*/
		//return -1;
		
		/*Except 1st element consider every element as duplicate*/
		//return 0;
	}

}
