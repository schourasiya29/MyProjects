package com.sac.multithreadingEnhancements;

public class ThreadLocalDemoA {

	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal() {
			public Object initialValue() {
				return "abc";
			}
		};
		System.out.println(tl.get());// abc
		tl.set("sachin");
		System.out.println(tl.get());// sachin
		tl.remove();
		System.out.println(tl.get());// abc
	}

}
