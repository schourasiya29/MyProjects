package com.sac.multithreading;

class Mythread3 extends Thread {
	/*
	 * We can override the start() method in our class and call it but doing so
	 * will not create any new thread and the start method will behave as a
	 * normal method call and there will be only one thread execution i.e the
	 * main thread
	 */

	public void start() {
		System.out.println("Start Method");
	}

	public void run() {
		System.out.println("Run Method");
	}
}

public class ThreadDemoOverriddingStartMethod {

	public static void main(String[] args) {
		Mythread3 t = new Mythread3();
		t.start();
		System.out.println("Main Method");
	}

}
