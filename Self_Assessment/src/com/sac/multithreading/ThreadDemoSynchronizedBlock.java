package com.sac.multithreading;

class Display4 {

	public void wish(String name) {
		;
		;
		;
		;
		// 1 lakh lines of code
		/*
		 * if we will not declare wish() method as synchronized then both
		 * thread(t1 & t2) will execute simultaneously and we will get irregular
		 * output.
		 * 
		 * But suppose if we have few lines of code which required
		 * synchronization under wish() method then we can declare that piece of
		 * code under synchronized block to reduce time and improve the
		 * performance
		 */
		synchronized (this) {
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

		;
		;
		;
		;
		;
		// 1 lakh lines of code
	}
}

class MyThread18 extends Thread {
	Display4 d;
	String name;

	MyThread18(Display4 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class ThreadDemoSynchronizedBlock {

	public static void main(String[] args) {
		Display4 d = new Display4();
		MyThread18 t = new MyThread18(d, "Dhoni");
		MyThread18 t1 = new MyThread18(d, "Yuvraj");
		t.start();
		t1.start();
	}

}
