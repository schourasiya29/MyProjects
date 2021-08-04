package com.sac.multithreadingEnhancements;

public class ThreadGroupDemo2 {
	/*
	 * Q-> Write a program to display all active thread names which belongs to
	 * the System Group and its child groups
	 */
	public static void main(String[] args) {
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[system.activeCount()];
		/*
		 * To copy all active threads of this thread group(system) into provided
		 * thread array 't' use system.enumerate(t) method. In this case
		 * sub-thread group threads will also be considered.
		 */
		system.enumerate(t);
		for (Thread t1 : t) {
			System.out.println("Name of thread = " + t1.getName() + "....." + "IsDaemon = " + t1.isDaemon());
		}
	}

}
