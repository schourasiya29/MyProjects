package com.sac.multithreading;

class Mythread4 extends Thread {

	public void start() {
		/*
		 * After overriding if we add the line super.start(), then a new thread
		 * will be created and output will be varied accordingly
		 */
		super.start();
		System.out.println("Start Method");
	}

	public void run() {
		System.out.println("Run Method");
	}
}

public class ThreadDemoOverriddingStartMethodWithSuperCall {

	public static void main(String[] args) {
		Mythread4 t = new Mythread4();
		t.start();
		System.out.println("Main Method");
	}

}
