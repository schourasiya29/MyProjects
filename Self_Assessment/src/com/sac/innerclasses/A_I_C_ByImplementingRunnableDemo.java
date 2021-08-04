package com.sac.innerclasses;

public class A_I_C_ByImplementingRunnableDemo {

	public static void main(String[] args) {

		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println("Child Thread");
				}
			}
		};

		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
