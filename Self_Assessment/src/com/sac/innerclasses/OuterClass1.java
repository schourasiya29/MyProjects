package com.sac.innerclasses;

/*Example: Accessing Inner class code from Instance area of Outer class*/
public class OuterClass1 {

	class InnerClass1 {
		public void m1() {
			System.out.println("Inner class normal method");
		}
	}

	public void m2() {
		InnerClass1 i = new InnerClass1();
		i.m1();
	}

	public static void main(String[] args) {
		OuterClass1 o = new OuterClass1();
		o.m2();
	}

}
