package com.sac.multithreading;

public class PrintEvenAndOddNumUsingTwoThreads {

	static int i = 20;
	int count = 1;

	public static void main(String[] args) {
		PrintEvenAndOddNumUsingTwoThreads obj = new PrintEvenAndOddNumUsingTwoThreads();

		Runnable r1 = () -> {
			obj.printOddNum();
		};

		Runnable r2 = () -> {
			obj.printEvenNum();
		};

		Thread t1 = new Thread(r1, "Thread-1");
		Thread t2 = new Thread(r2, "Thread-2");
		t1.start();
		t2.start();

	}

	private void printEvenNum() {
		while (count <= i) {
			if (count % 2 == 0) {
				System.out.println(Thread.currentThread().getName() + " " + count);
				count++;
			}
		}
	}

	private void printOddNum() {
		while (count < i) {
			if (count % 2 != 0) {
				System.out.println(Thread.currentThread().getName() + " " + count);
				count++;
			}
		}
	}

}
