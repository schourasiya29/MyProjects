package com.sac.innerclasses;

class Popcorn {
	public void taste() {
		System.out.println("Salty");
	}
}

public class AnonymousInnerClassDemo {

	public static void main(String[] args) {
		/*
		 * 1: We can create anonymous inner class for one time use as follows,
		 * where the class overrides the method of parent and create the child
		 * object using parent reference
		 */
		Popcorn p = new Popcorn() {
			public void taste() {
				System.out.println("Spicy");
			}
		};
		p.taste();

		/* 2:Creating parent class object and calling its taste method */
		Popcorn p1 = new Popcorn();
		p1.taste();

		/*
		 * 3: Creating another anonymous inner class with different
		 * implementation of taste method
		 */
		Popcorn p2 = new Popcorn() {
			public void taste() {
				System.out.println("Sweet");
			}
		};
		p2.taste();

		/* 4: Printing the names of all the classes */
		System.out.println("Normal class name is = " + p1.getClass().getName());
		System.out.println("1st anonymous inner class name is = " + p.getClass().getName());
		System.out.println("2nd anonymous inner class name is = " + p2.getClass().getName());
	}

}
