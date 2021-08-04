package com.sac.innerclasses;

/*Annonymous Inner class example by extending the thread class*/
public class A_I_C_ByExtendingThreadDemo {

	public static void main(String[] args) {
		
		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println("Child thread");
				}
			}
		};
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main thread");
		}
	}

}
