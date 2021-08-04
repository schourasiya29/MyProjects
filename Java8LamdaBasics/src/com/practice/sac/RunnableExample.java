package com.practice.sac;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello From Runnable");
			}
		});

		myThread.run();
		/*
		 * We can use the lambda here because it has only one abstract method
		 * run
		 */
		Thread myLambdaThread = new Thread(() -> System.out.println("Hello From Lambda Runnable"));
		myLambdaThread.run();
	}

}
