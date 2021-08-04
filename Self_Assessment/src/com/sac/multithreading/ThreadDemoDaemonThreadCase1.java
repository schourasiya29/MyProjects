package com.sac.multithreading;

class MyThread22 extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child Tread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemoDaemonThreadCase1 {

	public static void main(String[] args) {
		MyThread22 t = new MyThread22();
		/*
		 * If we will not set the child thread as daemon it will continue to run
		 * until its execution, But if we set it as Daemon, as soon as
		 * non-Daemon thread(main thread) is completed the JVM terminated all
		 * Daemon thread(in this case Child thread) automatically
		 */
		t.setDaemon(true);
		t.start();
		System.out.println("End of main thread");
	}

}
