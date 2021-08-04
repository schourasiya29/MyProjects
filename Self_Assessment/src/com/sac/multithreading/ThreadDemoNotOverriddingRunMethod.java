package com.sac.multithreading;

class Mythread2 extends Thread {
	/*
	 * If we will not override the run() method in our class then the Thread
	 * class run() method will be executed which has empty implementation and we
	 * will not get any output at the console.
	 * 
	 * Hence it is highly recommended to override the run() method to define our
	 * job
	 */
}

public class ThreadDemoNotOverriddingRunMethod {

	public static void main(String[] args) {
		Mythread2 t = new Mythread2();
		t.start();

	}

}
