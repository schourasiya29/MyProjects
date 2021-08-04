package com.sac.multithreadingEnhancements;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal();
		System.out.println(tl.get());//null
		tl.set("sachin");
		System.out.println(tl.get());//sachin
		tl.remove();
		System.out.println(tl.get());//null
	}

}
