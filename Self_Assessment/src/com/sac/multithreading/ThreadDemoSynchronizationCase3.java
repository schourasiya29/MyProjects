package com.sac.multithreading;

class Display3 {
	/*
	 * If we will not declare both the display methods as synchronized then we
	 * will get mixed output as "0A1B2CD34EF5G6H7I8J9K10"
	 * 
	 * If we declare both the methods as synchronized then we will get organized
	 * output as "012345678910ABCDEFGHIJK"
	 */
	public synchronized void displaynum() {
		for (int i = 0; i <= 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void displaychar() {
		for (int i = 65; i <= 75; i++) {
			System.out.print((char) i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThreadA1 extends Thread {
	Display3 d;

	MyThreadA1(Display3 d) {
		this.d = d;
	}

	public void run() {
		d.displaynum();
	}
}

class MyThreadA2 extends Thread {
	Display3 d;

	MyThreadA2(Display3 d) {
		this.d = d;
	}

	public void run() {
		d.displaychar();
	}
}

public class ThreadDemoSynchronizationCase3 {

	public static void main(String[] args) {
		Display3 d = new Display3();
		MyThreadA1 t1 = new MyThreadA1(d);
		MyThreadA2 t2 = new MyThreadA2(d);
		t1.start();
		t2.start();
	}

}
