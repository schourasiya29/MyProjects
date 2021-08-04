package com.sac.multithreading;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadDemoByExtendingThreadClass {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		/*
		 * Since there is no method like start() in our Class (MyThread) hence
		 *'Thread' class start() method is called when we execute t.start() 
		 * and the same is responsible to start a new thread. since Start() 
		 * method internally calls run() method hence our class task is 
		 * performed
		 */
		t.start();
		
		/*
		 * If we call run method it will act as a normal method and no new
		 * thread will be created and the output will be fixed for various JVM
		 * and machines.As only main thread will be executed.
		 */
		t.run();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
