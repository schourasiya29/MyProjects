package com.sac.multithreadingEnhancements;

class MyThread1 extends Thread {
	MyThread1(ThreadGroup g, String name) {
		super(g, name);

	}

	public void run() {
		System.out.println("Child Thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadGroupDemo1 {

	public static void main(String[] args) throws InterruptedException {
		ThreadGroup pg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup(pg, "Child Group");

		MyThread1 t1 = new MyThread1(pg, "ChildThread-1");
		MyThread1 t2 = new MyThread1(pg, "ChildThread-2");
		t1.start();
		t2.start();
		System.out.println("Active Thread Count in Parent Group = " + pg.activeCount());// 2
		System.out.println("Active Thread Group = " + pg.activeGroupCount());// 1
		pg.list();
		Thread.sleep(10000);
		System.out.println("Active Thread Count in Parent Group = " + pg.activeCount());// 0
		System.out.println("Active Thread Group = " + pg.activeGroupCount());// 1
		pg.list();

	}

}
