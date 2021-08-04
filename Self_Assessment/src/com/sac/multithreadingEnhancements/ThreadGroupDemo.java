package com.sac.multithreadingEnhancements;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		ThreadGroup g1 = new ThreadGroup("tg");
		Thread t1 = new Thread(g1, "Thread-1");
		Thread t2 = new Thread(g1, "Thread-2");
		/*
		 * Before setting the max priority of the thread group tg is 10 and all
		 * its threads(t1 and t2) priority will be default = 5
		 */
		g1.setMaxPriority(3);
		/*
		 * After setting thread group tg's max priority as 3 the newly created
		 * priority will change to 3 and all remaining threads will have the
		 * previous priority only
		 */
		Thread t3 = new Thread(g1, "Thread-3");
		System.out.println("Thread-1 priority is = " + t1.getPriority());// 5
		System.out.println("Thread-2 priority is = " + t2.getPriority());// 5
		System.out.println("Thread-3 priority is = " + t3.getPriority());// 3
	}

}
