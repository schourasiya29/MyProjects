package com.sac.collectionsframework.set;

import java.util.Comparator;
import java.util.TreeSet;

/*Customized sorting order descending*/
public class TreeSetCustomizedSortingDemo {

	public static void main(String[] args) {
		/*
		 * If we will not pass comparator object in the TreeSet constructor then
		 * JVM will call compareTo() method, which is meant for default natural
		 * sorting order. And if we will pass the comparator object in the
		 * TreeSet constructor then our own compare() method will be called by
		 * JVM and sorting will be done as per our logic
		 */
		TreeSet t = new TreeSet(new MyComparator());

		/* Default natural sorting for this */
		// TreeSet t = new TreeSet();

		t.add(10);
		t.add(5);
		t.add(20);
		t.add(4);
		t.add(2);
		t.add(20);
		System.out.println(t);
	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;

		if (i1 < i2) {
			return +1;
		} else if (i1 > i2) {
			return -1;
		} else
			return 0;

	}

}
