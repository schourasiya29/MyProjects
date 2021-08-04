package com.sac.multithreadingEnhancements;

import java.util.concurrent.locks.ReentrantLock;

class MyThread3 extends Thread {
	/*
	 * Created static ReentrantLock l so that only one copy of object will be
	 * available for both the threads
	 */
	static ReentrantLock l = new ReentrantLock();

	public MyThread3(String name) {
		super(name);
	}

	public void run() {
		if (l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + "....got the lock and performing safe operations");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			l.unlock();
		} else {
			System.out.println(Thread.currentThread().getName()
					+ "...unable to get lock and hence performing alternate operations");
		}
	}
}

public class ReentrantLockDemo2 {

	public static void main(String[] args) {
		MyThread3 t1 = new MyThread3("First Thread");
		MyThread3 t2 = new MyThread3("Second Thread");
		t1.start();
		t2.start();

	}

}
