package com.sac.multithreading;

class MyThread21 extends Thread {

}

public class ThreadDemoDaemonThread {

	public static void main(String[] args) {
		System.out.println("Main thread is always Daemon = " + Thread.currentThread().isDaemon());
		/*
		 * can't make main thread as Daemon else R.E.
		 * java.lang.IllegalThreadStateException
		 */
		// Thread.currentThread().setDaemon(true);

		MyThread21 t = new MyThread21();
		System.out.println("Child thread is Daemon = " + t.isDaemon());
		t.setDaemon(true);
		System.out.println("after setting Child thread is Daemon = " + t.isDaemon());
	}

}
