package com.sac.exceptionhandling;

public class WithTryCatchExample {
	/* Normal termination of the program */
	public static void main(String[] args) {
		System.out.println("First Statement");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println(10 / 2);
		}
		System.out.println("Second Statement");
	}

}
