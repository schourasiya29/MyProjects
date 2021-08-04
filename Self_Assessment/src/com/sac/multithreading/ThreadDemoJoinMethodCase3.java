package com.sac.multithreading;

class MyThread12 extends Thread {

	static Thread mt;

	public void run() {
		/*
		 * If main thread calls join() on child thread object and child thread
		 * calls join() on main thread object then both the threads will wait
		 * forever and the program will be stuck and no output will be there at
		 * the console, this is something like DeadLock
		 */
		try {
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadDemoJoinMethodCase3 {

	public static void main(String[] args) throws InterruptedException {

		MyThread12.mt = Thread.currentThread();
		MyThread12 t = new MyThread12();
		t.start();
		/*
		 * If main thread calls join() on child thread object and child thread
		 * calls join() on main thread object then both the threads will wait
		 * forever and the program will be stuck and no output will be there at
		 * the console, this is something like DeadLock
		 */
		t.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
	}

}
