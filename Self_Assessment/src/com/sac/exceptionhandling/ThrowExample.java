package com.sac.exceptionhandling;

public class ThrowExample {
	/*
	 * In this case we created an Exception Object and handed over to JVM by
	 * using the throw keyword
	 */
	public static void main(String[] args) {
		throw new ArithmeticException("/ by Zero");
	}

}
