package com.sac.collectionsframework.set;

import java.util.Comparator;
import java.util.TreeSet;

/*StringBuffer objects are not comparable hence default 
 * natural sorting is not possible if we will try to 
 * do we will get runtime exception saying 
 * 'ClassCastException'*/
public class TreeSetCustomizedSortingDemo3 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator3());
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		System.out.println(t);
	}

}

class MyComparator3 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}

}