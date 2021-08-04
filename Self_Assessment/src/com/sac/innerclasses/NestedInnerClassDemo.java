package com.sac.innerclasses;

public class NestedInnerClassDemo {

	static class Nested {

		public void m1() {
			System.out.println("Static Nested Class Method");
		}

	}

	public static void main(String[] args) {
		/*
		 * in case of static nested classes without existing outer class object
		 * we can access inner class members by creating only inner class object
		 */
		Nested n = new Nested();
		n.m1();
	}

}
