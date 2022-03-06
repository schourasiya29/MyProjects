package com.sac.collectionsframework.map;

import java.util.HashMap;
import java.util.WeakHashMap;

/*In case of HashMap the HashMap dominates the Garbage 
 *collector and in case of the WeakHashMap the garbage 
 *collector dominates the WeakhashMap*/

class Temp {

	public String toString() {
		return "temp";
	}

	public void finalize() {
		System.out.println("Finalize method called");
	}
}

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		Temp t = new Temp();
		/*
		 * Even after calling GC and deleting the reference the HashMap entry is
		 * not destroyed by GC
		 */
		// HashMap hm = new HashMap();
		/*
		 * If we use WeakHashMap then GC will delete that entry and we will get
		 * no data
		 */
		WeakHashMap hm = new WeakHashMap();
		hm.put(t, "durga");
		System.out.println(hm);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(hm);
	}

}
