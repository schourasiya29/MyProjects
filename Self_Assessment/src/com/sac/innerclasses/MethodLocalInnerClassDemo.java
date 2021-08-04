package com.sac.innerclasses;

public class MethodLocalInnerClassDemo {

	/*
	 * when repeated functionality is required go for method local inner classed
	 * i.e nested method functionality is required
	 */
	public void m1() {
		class Inner {
			public void sum(int x, int y) {
				System.out.println("Sum is = " + (x + y));
			}
		}
		Inner i = new Inner();
		i.sum(10, 20);
		i.sum(100, 200);
		i.sum(1000, 2000);
		i.sum(10000, 20000);
	}

	public static void main(String[] args) {
		new MethodLocalInnerClassDemo().m1();
	}

}
