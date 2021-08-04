package com.sac.multithreadingEnhancements;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread4 extends Thread {
	/*
	 * Created static ReentrantLock l so that only one copy of object will be
	 * available for both the threads
	 */
	static ReentrantLock l = new ReentrantLock();

	public MyThread4(String name) {
		super(name);
	}

	public void run() {
		do {
			try {
				/*
				 * Here one thread will get the lock and sleep for 30 seconds
				 * while second thread will come and try for lock again and
				 * again until it gets the lock and completes its execution
				 */
				if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + "....got the lock");
					Thread.sleep(30000);
					l.unlock();
					System.out.println(Thread.currentThread().getName() + "....releases the lock");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + "...unable to get lock will try again");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (true);
	}
}

public class ReentrantLockDemo3 {

	public static void main(String[] args) {
		MyThread4 t1 = new MyThread4("First Thread");
		MyThread4 t2 = new MyThread4("Second Thread");
		t1.start();
		t2.start();

	}

}
