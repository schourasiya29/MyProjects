package com.sac.multithreading;

class MyThread11 extends Thread {

	/*
	 * If we want child thread to wait and want Main thread to complete first
	 * then we need to call join method on main thread object and for that we
	 * need a main thread object, lets create a static thread reference as
	 * static Thread mt;
	 */
	static Thread mt;

	public void run() {
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

public class ThreadDemoJoinMethodCase2 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * If we want child thread to wait and want Main thread to complete
		 * first then we need to call join method on main thread object and for
		 * that we need a main thread object, lets create a static thread
		 * reference and assign it with current thread object as - MyThread11.mt
		 * = Thread.currentThread();
		 */
		MyThread11.mt = Thread.currentThread();
		MyThread11 t = new MyThread11();
		t.start();
		t.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
	}

}
