package com.sac.garbagecollection;

import java.util.Date;

public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt.totalMemory());
		System.out.println(rt.freeMemory());
		for (int i = 0; i <= 10000; i++) {
			Date d = new Date();
			d = null;// Making objects eligible for GC
		}
		System.out.println(rt.freeMemory());

		rt.gc();// Requesting JVM to call GC

		System.out.println(rt.freeMemory());
	}
}
