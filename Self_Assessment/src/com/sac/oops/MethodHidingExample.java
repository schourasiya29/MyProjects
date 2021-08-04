package com.sac.oops;

/*1-> Both Static Methods
2-> Method resolution by compiler based on reference type
3-> It is called compile time Polymorphism/ Static Polymorphism or Early Binding*/
class Parent {
	public static void m1() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	public static void m1() {
		System.out.println("Child");
	}
}

public class MethodHidingExample {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		Child c = new Child();
		c.m1();
		Parent p1 = new Child();
		p1.m1();
	}

}
