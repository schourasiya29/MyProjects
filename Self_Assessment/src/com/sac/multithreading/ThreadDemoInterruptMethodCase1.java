package com.sac.multithreading;

class MyThread13 extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("I am lazy thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("I got Interrupted");
		}
	}

}

public class ThreadDemoInterruptMethodCase1 {

	public static void main(String[] args) {
		MyThread13 t = new MyThread13();
		t.start();
		/*
		 * If we want to interrupt a thread we can use the interrupt method for
		 * the same
		 * 
		 * Here Main thread interrupts the child thread by calling interrupt
		 * method on child's object
		 */
		//t.interrupt();
		System.out.println("End of main Thread");
	}

}
