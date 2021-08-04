package com.sac.multithreadingEnhancements;

public class ThreadGroupNameDemo1 {

	public static void main(String[] args) {
		ThreadGroup g = new ThreadGroup("First Group");
		System.out.println(g.getParent().getName());
		ThreadGroup g1 = new ThreadGroup(g, "Second Group");
		System.out.println(g1.getParent().getName());
	}

}
