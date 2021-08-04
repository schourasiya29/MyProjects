package com.sac.multithreading;

class Display1 {
	/* Synchronized Method */
	public synchronized void wish(String name) {
		for (int i = 0; i <= 10; i++) {
			System.out.print("Good Morning: ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}

class MyThread16 extends Thread {
	Display1 d;
	String name;

	MyThread16(Display1 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class ThreadDemoSynchronizationCase1 {

	public static void main(String[] args) {
		/*
		 * Even though wish() method is synchronized we will get irregular
		 * output because threads are operating on different objects(d1 & d2)
		 * 
		 * Reason - Whenever multiple threads are operating on same objects then
		 * only synchronization play role. If multiple threads are operating on
		 * multiple objects simultaneously then there will be no impact of
		 * synchronization
		 * 
		 * In this example we will get irregular output even when wish() is
		 * synchronized
		 */
		Display1 d1 = new Display1();
		Display1 d2 = new Display1();
		MyThread16 t = new MyThread16(d1, "Dhoni");
		MyThread16 t1 = new MyThread16(d2, "Yuvraj");
		t.start();
		t1.start();
	}

}
