package com.sac.exceptionhandling;

import java.util.Scanner;

class TooYoungException extends RuntimeException {
	TooYoungException(String msg) {
		/*
		 * To make description msg available to default exception handler
		 * super() is required
		 */
		super(msg);
	}
}

class TooOldException extends RuntimeException {
	TooOldException(String msg) {
		/*
		 * To make description msg available to default exception handler
		 * super() is required
		 */
		super(msg);
	}
}

public class CustomExceptionDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		if (age > 60) {
			throw new TooOldException(
					"Your age is already crossed the marriage age...no chance of getting married now");
		} else if (age < 18) {
			throw new TooYoungException("Please wait for some more time...you will get best match soon");

		}

		else {
			System.out.println("You will get the match details soon by email...");

		}

	}
}
