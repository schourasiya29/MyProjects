package com.sac.multithreading;

class MyThread6 extends Thread {

}

public class ThreadDemoNamesOfThread {

	public static void main(String[] args) {
		/*
		 * Use Thread class final method getName() to get the name of the thread
		 * and Thread.currentThread().getName() to get the name of the current
		 * executing thread (here main)
		 */
		System.out.println(Thread.currentThread().getName());
		/*
		 * Use Thread class final method setName() to set the name of the thread
		 * and Thread.currentThread().setName() to set the name of current
		 * executing thread even main thread
		 */
		Thread.currentThread().setName("Sachin");
		// System.out.println(10 / 0);

		MyThread6 t = new MyThread6();
		/* Prints JVM defined name if not set by user */
		System.out.println(t.getName());
		t.setName("MyFirstThread");
		System.out.println(t.getName());
	}

}
