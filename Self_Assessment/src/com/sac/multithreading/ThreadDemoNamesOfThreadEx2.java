package com.sac.multithreading;

class MyThread7 extends Thread {
	public void run() {
		System.out.println("run method executed by the Thread: " + Thread.currentThread().getName());
	}
}

public class ThreadDemoNamesOfThreadEx2 {

	public static void main(String[] args) {

		MyThread7 t = new MyThread7();
		t.start();
		System.out.println("main method executed by Thread: " + Thread.currentThread().getName());
	}

}
