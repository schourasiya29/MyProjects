package com.sac.multithreading;

public class ThreadDemoJoinMethodCase4 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * If a thread calls join() method on the same thread object itself then
		 * the program will be stuck, this is something like a DeadLock and in
		 * this case thread has to wait for infinite amount of time
		 */
		Thread.currentThread().join();
		System.out.println("Main Thread");
	}

}
