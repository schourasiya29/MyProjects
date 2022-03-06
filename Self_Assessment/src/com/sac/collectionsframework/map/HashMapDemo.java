package com.sac.collectionsframework.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("Sachin", 100);
		m.put("Sonu", 200);
		m.put("Abhishek", 400);
		m.put("Vipin", 300);
		m.put("Yashi", 200);
		System.out.println(m);
		// Prints the replaced value
		System.out.println(m.put("Sonu", 500));

		// Prints all the keys
		Set t = m.keySet();
		System.out.println(t);

		// Prints all the values
		Collection c = m.values();
		System.out.println(c);

		// Prints all entries
		Set s1 = m.entrySet();
		System.out.println(s1);

		/*
		 * Iterating over each entry element to use the entry specific methods
		 * i.e. getKey(),getValue and setValue
		 */
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey()+"..."+m1.getValue());
			
			if (m1.getKey().equals("Sonu")){
				m1.setValue(550);
			}
		}
		System.out.println(m);
	}

}
