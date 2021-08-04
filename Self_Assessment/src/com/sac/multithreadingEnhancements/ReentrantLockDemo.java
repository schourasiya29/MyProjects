package com.sac.multithreadingEnhancements;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

	public static void main(String[] args) {
		ReentrantLock l = new ReentrantLock();
		l.lock();
		l.lock();
		System.out.println("Is it locked = " + l.isLocked());
		System.out.println("Is it Held by current thread = " + l.isHeldByCurrentThread());
		System.out.println("Queue Length is = " + l.getQueueLength());
		System.out.println("Hold Count is = " + l.getHoldCount());
		l.unlock();
		System.out.println("Hold Count is = " + l.getHoldCount());
		System.out.println("Is it locked = " + l.isLocked());
		l.unlock();
		System.out.println("Is it locked = " + l.isLocked());
		System.out.println("Is it Fair = " + l.isFair());
	}

}
