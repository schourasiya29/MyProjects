package com.sac.collectionsframework.map;

import java.util.TreeMap;

public class TreeMapDefaultSortingDemo {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(100, "zzzz");
		tm.put(103, "yyyy");
		tm.put(101, "xxxx");
		tm.put(104, 106);
		tm.put(107, null);
		//tm.put("FFFF", "ZZZZ");//CCE
		//tm.put(null, "xxxx");//NPE
		System.out.println(tm);

	}

}
