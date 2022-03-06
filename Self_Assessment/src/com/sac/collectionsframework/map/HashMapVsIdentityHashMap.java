package com.sac.collectionsframework.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

/*An Identity Map is exactly same as HashMap with the only 
 *difference that to check duplicate keys in case of HashMap
 *JVM uses .equals() method while in case of IdentityHashMap
 *JVM uses '==' operator to check the duplicate keys*/
public class HashMapVsIdentityHashMap {

	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		HashMap hm = new HashMap();
		hm.put(i1, "Sachin");
		hm.put(i2, "Sonu");
		System.out.println(hm);// Only one entry as keys are duplicate and value
								// is overwritten

		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);
		IdentityHashMap im = new IdentityHashMap();
		im.put(i3, "Sachin");
		im.put(i4, "Sonu");
		System.out.println(im);// Both entries will be printed in this case
	}

}
