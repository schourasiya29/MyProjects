package com.sac.concurrentcollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*If we replace concurrentHashMap with HashMap we will get 
 * concurrentModification exception*/
public class ConcurrentHashMapDemo extends Thread {
	static ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
	// static HashMap<Integer, String> chm = new HashMap<>();

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Child thread is updating the map");
		chm.put(103, "C");
	}

	public static void main(String[] args) throws InterruptedException {
		chm.put(101, "A");
		chm.put(102, "B");
		ConcurrentHashMapDemo tobj = new ConcurrentHashMapDemo();
		tobj.start();

		Set s = chm.keySet();

		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println("Main thread iterating and the current Entry is " + i + ".." + chm.get(i));
			Thread.sleep(5000);
		}
		System.out.println(chm);
	}

}
