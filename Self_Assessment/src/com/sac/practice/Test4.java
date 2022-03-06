package com.sac.practice;

public class Test4 {

	public static void main(String[] args) {

		try {
			System.out.println(doStuff(args));
		} catch (Exception e) {
			System.out.println("exc");

		}
		doStuff(args);

	}

	/*
	 * String str = new String("GeeksForGeeks"); // making str eligible for gc
	 * str = null; // calling garbage collector System.gc(); // waiting for gc
	 * to complete Thread.sleep(1000); System.out.println("end of main");
	 */

	static int doStuff(String[] args) {
		return Integer.parseInt(args[0]);
	}

	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}

}
