package com.sac.multithreading;

class MyThread14 extends Thread {
	public void run() {

		for (int i = 0; i <= 1000; i++) {
			System.out.println("I am lazy thread-" + i);
		}
		System.out.println("I am entering into sleep state now");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("I got Interrupted");
		}
	}

}

public class ThreadDemoInterruptMethodCase2 {

	public static void main(String[] args) {
		MyThread14 t = new MyThread14();
		t.start();
		/*
		 * Interrupt() method call is never wasted, its waits for the target
		 * thread to come to waiting or sleeping state, once the target thread
		 * enters into sleep or wait state the Interrupt method impacts it
		 * 
		 * Interrupt() call only wasted if the target thread in never gone into
		 * sleep or waiting state in its entire lifetime
		 */
		t.interrupt();
		System.out.println("End of main Thread");
	}

}
