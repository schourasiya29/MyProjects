package com.sac.multithreading;

/* If all the four methods in class A and B are not synchronized 
 * then the program will work fine, the deadlock situation arises
 * as soon as we declare all the methods as synchronized.
 * 
 * Output before synch-->
 * ---------------------------------------------
 * Thread-1 starts execution of d1() method
 * Thread-2 starts execution of d2() method
 * Thread-1 is trying to call B's last() method
 * Thread-2 is trying to call A's last() method
 * Inside A, this is last() method
 * Inside B, this is last() method
 * ---------------------------------------------
 * Output after synch-->
 * Thread-1 starts execution of d1() method
 * Thread-2 starts execution of d2() method
 * Thread-2 is trying to call A's last() method
 * Thread-1 is trying to call B's last() method
 * ---------------------------------------------
 * Both thread will hold lock of each other and wait
 * each other to release lock and hence deadlock situation
 */
class A {
	public synchronized void d1(B b) {
		System.out.println("Thread-1 starts execution of d1() method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread-1 is trying to call B's last() method");
		b.last();
	}

	public synchronized void last() {
		System.out.println("Inside A, this is last() method");
	}
}

class B {
	public synchronized void d2(A a) {
		System.out.println("Thread-2 starts execution of d2() method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread-2 is trying to call A's last() method");
		a.last();
	}

	public synchronized void last() {
		System.out.println("Inside B, this is last() method");
	}
}

class DeadLock extends Thread {
	A a = new A();
	B b = new B();

	public void m1() {
		/*
		 * After this line there will be two threads i.e. one is main and
		 * another one is child thread
		 */
		this.start();
		a.d1(b);// This line is executed by main thread
	}

	public void run() {
		b.d2(a);// This line is executed by child thread
	}
}

public class ThreadDemoDeadLock {

	public static void main(String[] args) {
		DeadLock d = new DeadLock();
		/*
		 * we did not write d.start() here because after d.start we have to call
		 * a.d1() method and a & b is instance variables and we can call
		 * instance variables from static area
		 */
		d.m1();
	}

}
