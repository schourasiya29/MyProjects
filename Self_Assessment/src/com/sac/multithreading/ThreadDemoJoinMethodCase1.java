package com.sac.multithreading;

class MyThread10 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Seetha Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemoJoinMethodCase1 {

	public static void main(String[] args) throws InterruptedException {
		MyThread10 t = new MyThread10();
		t.start();
		/*
		 * If we call join method on t, until MyThread or Seetha thread
		 * completes the main thread will not get the chance
		 */
		t.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Rama Thread");
		}
	}

}
