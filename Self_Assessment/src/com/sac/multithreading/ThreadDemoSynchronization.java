package com.sac.multithreading;

class Display {
	/*
	 * if we will not declare wish() method as synchronized then both thread(t1
	 * & t2) will execute simultaneously and we will get irregular output.
	 * 
	 * But if we declare wish() as synchronized then threads will execute one by
	 * one and we will get regular output
	 */
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

class MyThread15 extends Thread {
	Display d;
	String name;

	MyThread15(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class ThreadDemoSynchronization {

	public static void main(String[] args) {
		Display dObj = new Display();
		MyThread15 t = new MyThread15(dObj, "Dhoni");
		MyThread15 t1 = new MyThread15(dObj, "Yuvraj");
		t.start();
		t1.start();
	}

}
