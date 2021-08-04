package com.sac.multithreading;

class MyThread9 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			/*
			 * If we are commenting line -Thread.yield(), then both threads will
			 * execute simultaneously and we can't expect exact output.
			 * 
			 * But if we will not comment the line -Thread.yield(), then the
			 * chance of completing the main thread first is high because child
			 * thread always calls yield() method
			 */
			Thread.yield();
		}
	}
}

public class ThreadDemoYieldMethod {

	public static void main(String[] args) {
		MyThread9 t = new MyThread9();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
