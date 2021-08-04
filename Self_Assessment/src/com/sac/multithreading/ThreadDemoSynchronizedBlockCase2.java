package com.sac.multithreading;

class Display6 {

	public void wish(String name) {
		;
		;
		;
		;
		// 1 lakh lines of code
		/*
		 * For both the threads current object is different and hence we will
		 * get irregular output, to avoid this we may need to declare the
		 * synchronized block as follows to get the class level lock and regular
		 * output
		 */
		synchronized (Display.class) {
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

class MyThread20 extends Thread {
	Display6 d;
	String name;

	MyThread20(Display6 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class ThreadDemoSynchronizedBlockCase2 {

	public static void main(String[] args) {
		Display6 d = new Display6();
		Display6 d1 = new Display6();
		/*
		 * For both the threads current object is different and hence we will
		 * get irregular output, to avoid this we may need to declare the class
		 * level synchronized block
		 */
		MyThread20 t = new MyThread20(d, "Dhoni");
		MyThread20 t1 = new MyThread20(d1, "Yuvraj");
		t.start();
		t1.start();
	}

}
