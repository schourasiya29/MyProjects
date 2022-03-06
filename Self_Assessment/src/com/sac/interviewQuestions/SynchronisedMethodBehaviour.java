package com.sac.interviewQuestions;

public class SynchronisedMethodBehaviour {

	public static void main(String[] args) {
		
		SynchronisedMethodBehaviour o1 = new SynchronisedMethodBehaviour();
		SynchronisedMethodBehaviour o2 = new SynchronisedMethodBehaviour();
		
		Runnable r1 = () -> {
			o1.m1();
		};
		Runnable r2 = () -> {
			o2.m1();
		};

		Thread t1 = new Thread(r1, "Thread-1");
		Thread t2 = new Thread(r2, "Thread-2");
		t1.start();
		t2.start();
	}

	public synchronized void m1() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("m1() method called by thread " + Thread.currentThread().getName());
	}

}
