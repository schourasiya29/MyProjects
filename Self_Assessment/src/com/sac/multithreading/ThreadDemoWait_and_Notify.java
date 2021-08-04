package com.sac.multithreading;

public class ThreadDemoWait_and_Notify {
	// This class will act as ThreadA
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		// After this line there will be two threads threadA and threadB
		synchronized (b) {
			System.out.println("Main thread calling wait() method");
			b.wait();
			System.out.println("Main thread got notification");
			System.out.println("The total sum is " + b.total);
		}
	}

}

class ThreadB extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("Child thread starts calculation");
			for (int i = 1; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("Child thread giving notification");
			this.notify();
		}
	}
}
