package com.sac.multithreading;

class Display5 {

	public void wish(String name) {
		;
		;
		;
		;
		// 1 lakh lines of code
		/*
		 * For both the threads current object is different and hence we will
		 * get irregular output, to avoid this we may need to declare the class
		 * level synchronized block (ex- check ThreadDemoSynchroizedCase2)
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

class MyThread19 extends Thread {
	Display5 d;
	String name;

	MyThread19(Display5 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class ThreadDemoSynchronizedBlockCase1 {

	public static void main(String[] args) {
		Display5 d = new Display5();
		Display5 d1 = new Display5();
		/*
		 * For both the threads current object is different and hence we will
		 * get irregular output, to avoid this we may need to declare the class
		 * level synchronized block (ex- check ThreadDemoSynchroizedBlockCase2)
		 */
		MyThread19 t = new MyThread19(d, "Dhoni");
		MyThread19 t1 = new MyThread19(d1, "Yuvraj");
		t.start();
		t1.start();
	}

}
