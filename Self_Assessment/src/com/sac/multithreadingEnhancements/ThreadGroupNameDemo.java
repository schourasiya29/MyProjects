package com.sac.multithreadingEnhancements;

class MyThread extends Thread {

	public void run (){
		
	}
}

public class ThreadGroupNameDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

		MyThread t = new MyThread();
		t.start();
		System.out.println("Child Thread Group Name = " + t.getThreadGroup().getName());
		System.out.println("Child Thread Group parent Name = " + t.getThreadGroup().getParent().getName());
	}

}
