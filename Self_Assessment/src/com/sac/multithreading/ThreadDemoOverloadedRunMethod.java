package com.sac.multithreading;

class Mythread1 extends Thread {
	/*
	 * we can overload the run() method but start() method will always call the
	 * no-arg run() method
	 */
	public void run() {
		System.out.println("No-arg run method");
	}

	public void run(int i) {
		System.out.println("Int-arg run method");

	}
}

public class ThreadDemoOverloadedRunMethod {

	public static void main(String[] args) {
		Mythread1 t = new Mythread1();
		t.start();
		/*
		 * we can overload the run() method but start() method will always call
		 * the no-arg run() method, we have to call the argument run() method
		 * explicitly
		 */
		t.run(10);
	}

}
