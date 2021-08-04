package com.sac.practice;

/*
Example of Coupling(Tightly coupled) changing the value in method m1() in  class D
affects the values in class A, B and C simultaneously.*/
class A {
	static int i = B.j;
}

class B {
	static int j = C.k;
}

class C {
	static int k = D.m1();
}

class D {
	public static int m1() {
		//return 10;
		 return 20;

	}
}

public class TightCoupling {

	public static void main(String[] args) {
		System.out.println("A Class Value i = " + A.i);
		System.out.println("B Class Value j = " + B.j);
		System.out.println("C Class Value k = " + C.k);
	}

}
