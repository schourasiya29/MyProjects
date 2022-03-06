package com.sac.multithreading;

public class PrintEvenOddUsingWaitAndNotify {

	int counter = 1;

	static int N;

	public static void main(String[] args) {
		N = 20;
		PrintEvenOddUsingWaitAndNotify obj = new PrintEvenOddUsingWaitAndNotify();

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

	public void printOddNum() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + counter);
				counter++;
				notify();
			}
		}
	}

	public void printEvenNum() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 != 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + counter);
				counter++;
				notify();
			}
		}

	}

}
