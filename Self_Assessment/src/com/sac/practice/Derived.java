package com.sac.practice;

/*Example of Static Control flow in Parent Child*/
class Base {
	static int x = 10;
	static {
		m1();
		System.out.println("Base Static Block");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("Base Main Method");
	}

	public static void m1() {
		System.out.println(y);
	}

	static int y = 20;
}

public class Derived extends Base {
	static int i = 100;
	static {
		m2();
		System.out.println("Derived Static Block");
	}

	public static void main(String[] args) {
		m2();
		System.out.println("Derived Main Method");
	}

	public static void m2() {
		System.out.println(j);
	}

	static int j = 200;
}
