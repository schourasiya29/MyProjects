package com.sac.generics;

class MyGenericsClass<T> {
	T ob;

	MyGenericsClass(T ob) {
		this.ob = ob;
	}

	public void show() {
		System.out.println("The type of object ob is = " + ob.getClass().getName());
	}

	public T get() {
		return ob;
	}
}

public class MyOwnGenericsClassDemo {

	public static void main(String[] args) {
		MyGenericsClass<String> g1 = new MyGenericsClass<String>("durga");
		g1.show();
		System.out.println(g1.get());

		MyGenericsClass<Integer> g2 = new MyGenericsClass<Integer>(10);
		g2.show();
		System.out.println(g2.get());

		MyGenericsClass<Double> g3 = new MyGenericsClass<Double>(10.5);
		g3.show();
		System.out.println(g3.get());
	}

}
