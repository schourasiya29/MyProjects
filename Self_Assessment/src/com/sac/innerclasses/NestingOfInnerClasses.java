package com.sac.innerclasses;

class A {
	class B {
		class C {
			public void m1() {
				System.out.println("InnerMost class Method");
			}
		}
	}
}

public class NestingOfInnerClasses {

	public static void main(String[] args) {
		/*
		 * A a = new A(); 
		 * A.B b = a.new B(); 
		 * A.B.C c = b.new C(); 
		 * c.m1();
		 */

		/* or */
		new A().new B().new C().m1();

	}

}
