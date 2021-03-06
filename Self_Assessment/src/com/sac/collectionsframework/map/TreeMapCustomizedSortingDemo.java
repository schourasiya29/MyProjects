package com.sac.collectionsframework.map;

import java.util.Comparator;
import java.util.TreeMap;


class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1 = (String)o1;
		String s2 = (String) o2;
		return s2.compareTo(s1);//descending order
	}
	
}
public class TreeMapCustomizedSortingDemo {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap(new MyComparator());
		tm.put("xxxx", 10);
		tm.put("zzzz", 30);
		tm.put("yyyy", 20);
		tm.put("wwww", 50);
		tm.put("vvvv", 60);
		System.out.println(tm);
		

	}

}
