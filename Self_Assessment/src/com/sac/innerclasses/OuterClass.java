package com.sac.innerclasses;

/*Example: Accessing Inner class code from static area of Outer class*/
public class OuterClass {

	class InnerClass {
		public void m1() {
			System.out.println("Inner class normal method");
		}
	}

	public static void main(String[] args) {
		/*
		 * OuterClass o = new OuterClass(); OuterClass.InnerClass i = o.new
		 * InnerClass(); i.m1();
		 */

		/* or */

		/*
		 * OuterClass.InnerClass i = new OuterClass().new InnerClass(); i.m1();
		 */

		/* or */

		new OuterClass().new InnerClass().m1();
	}

}
