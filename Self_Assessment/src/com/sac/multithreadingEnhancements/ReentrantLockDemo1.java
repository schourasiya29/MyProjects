package com.sac.multithreadingEnhancements;

import java.util.concurrent.locks.ReentrantLock;

class Display {
	/*
	 * If we will not use any synchronization or Reentrant locks we will get
	 * irregular output. 
	 * Here we will use ReentrantLock class's method(lock() and unlock()) to 
	 * achieve regular output and not synchronization
	 */
	ReentrantLock l = new ReentrantLock();

	public void wish(String name) {
		l.lock();//------>(1)
		for (int i = 0; i <= 10; i++) {
			System.out.print("Good Morning:");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
		l.unlock();//------>(2)
	}
}

class MyThread2 extends Thread {
	Display d;
	String name;

	MyThread2(Display d, String name) {
		this.d = d;
		this.name = name;

	}

	public void run() {
		d.wish(name);
	}
}

public class ReentrantLockDemo1 {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread2 t1 = new MyThread2(d, "Dhoni");
		MyThread2 t2 = new MyThread2(d, "Yuvraj");
		t1.start();
		t2.start();
	}

}
