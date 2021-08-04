package com.sac.multithreading;

class MyThread8 extends Thread {

}

public class ThreadDemoDefaultPriorityExample {

	public static void main(String[] args) {
		/* Default priority of main thread always = '5' */
		System.out.println("Default Priority of main thread is: " + Thread.currentThread().getPriority());
		/*
		 * Range of priority should be 1 to 10 else we will get exception-
		 * java.lang.IllegalArgumentException
		 */
		// Thread.currentThread().setPriority(15);
		System.out.println("Setting priority of main thread as 7");
		Thread.currentThread().setPriority(7);
		
		MyThread8 t = new MyThread8();
		/*
		 * whatever the priority main thread has by default the child will have
		 * the same priority
		 */
		System.out.println("Priority of child thread is: " + t.getPriority());
	}

}
