package com.sac.exceptionhandling;

public class MethodsToPrintException {

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			/*
			 * Prints complete information Name of the Exception: Description
			 * followed by Stack trace
			 */
			e.printStackTrace();
			System.out.println("*****************************************");
			/*
			 * Prints the information as Name of the Exception: Description Both
			 * e and e.tostring() are same
			 */
			System.out.println(e);
			System.out.println("*****************************************");
			//System.out.println(e.toString());
			/*
			 * Prints the information as Description of exception only
			 */
			System.out.println(e.getMessage());
		}
	}

}
