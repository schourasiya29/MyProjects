package com.sac.multithreading;

class Display2 {
	/* Static Synchronized Method - Class Level Lock */
	/*
	 * If a thread wants to execute a static synchronized method it requires
	 * class level lock
	 * 
	 * When a thread executes a static synchronized method then remaining
	 * threads are not allowed to execute any static synchronized method of that
	 * class, but remaining threads can access the non static synchronized
	 * methods without any issue
	 * 
	 * In this case because of class- level lock we will get regular output
	 */
	public static synchronized void wish(String name) {
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

class MyThread17 extends Thread {
	Display2 d;
	String name;

	MyThread17(Display2 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class ThreadDemoSynchronizationCase2 {

	public static void main(String[] args) {
		/*
		 * Even though wish() method is synchronized we will get irregular
		 * output because threads are operating on different objects(d1 & d2)
		 * 
		 * Reason - Whenever multiple threads are operating on same objects then
		 * only synchronization play role. If multiple threads are operating on
		 * multiple objects simultaneously then there will be no impact of
		 * synchronization
		 */
		Display2 d1 = new Display2();
		Display2 d2 = new Display2();
		MyThread17 t = new MyThread17(d1, "Dhoni");
		MyThread17 t1 = new MyThread17(d2, "Yuvraj");
		t.start();
		t1.start();
	}

}
