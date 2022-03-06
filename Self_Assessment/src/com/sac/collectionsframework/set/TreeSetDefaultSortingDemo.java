package com.sac.collectionsframework.set;

import java.util.TreeSet;

//Deafult sorting order is ascending in case of integer
public class TreeSetDefaultSortingDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(5);
		t.add(20);
		t.add(4);
		t.add(2);
		t.add(20);
		System.out.println(t);
	}

}
