package com.sac.java.langpackage;

/*This example is valid in 1.5 version and not in 1.4 version*/
public class AutoboxingAutounboxingDemo {
	static Integer I = 10;// Autoboxing

	public static void main(String[] args) {
		int i = I;// Autounboxing
		m1(i);//// Autoboxing
	}

	public static void m1(Integer K) {
		int m = K;// Autounboxing
		System.out.println(m);

	}
}
