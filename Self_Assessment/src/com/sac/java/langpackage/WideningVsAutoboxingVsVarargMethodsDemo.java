package com.sac.java.langpackage;

public class WideningVsAutoboxingVsVarargMethodsDemo {

	/*
	 * In general var-arg methods will get least priority i.e. if no other
	 * method matched then only it will get the chance. and the precedence will
	 * always be as follows:
	 * 1->Widening
	 * 2->Autoboxing
	 * 3->Var-arg method
	 */

	public static void m1(long l) {
		System.out.println("Widening");
	}

	public static void m1(Integer I) {
		System.out.println("Autoboxing");
	}

	public static void m1(int... i) {
		System.out.println("var-arg method");
	}

	public static void main(String[] args) {
		int x = 10;
		m1(x);

	}

}
