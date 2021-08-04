package com.sac.exceptionhandling;

public class ThrowsExample {
	
	/*
	 * Throws keyword is used only to delegate the responsibility of exception
	 * handling to its caller method
	 */

	public static void main(String[] args) throws InterruptedException {
		doStuff();
	}

	public static void doStuff() throws InterruptedException {
		doMoreStuff();
	}

	public static void doMoreStuff() throws InterruptedException {
		Thread.sleep(10000);
	}

}
