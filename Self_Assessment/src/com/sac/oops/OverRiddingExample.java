package com.sac.oops;

/*1-> Both non-Static Methods
2-> Method resolution by JVM based on runtime Object
3-> It is called Runtime Polymorphism/ Dynamic Polymorphism or Late Binding*/
class Parent1 {
	public void m1() {
		System.out.println("Parent");
	}
}

class Child1 extends Parent1 {
	public void m1() {
		System.out.println("Child");
	}
}

public class OverRiddingExample {

	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.m1();
		Child1 c = new Child1();
		c.m1();
		Parent1 p1 = new Child1();
		p1.m1();

	}

}
