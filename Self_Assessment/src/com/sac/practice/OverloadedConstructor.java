package com.sac.practice;

public class OverloadedConstructor {

	public OverloadedConstructor() {
		this(10);//internally calling int constructor
		System.out.println("No-arg constructor");
	}

	public OverloadedConstructor(int i) {
		this(10.5);//internally calling double constructor
		System.out.println("int-arg constructor");
	}

	public OverloadedConstructor(double b) {
		System.out.println("double-arg constructor");
	}

	public static void main(String[] args) {
		OverloadedConstructor o = new OverloadedConstructor();
		System.out.println("------------------------------------------");
		OverloadedConstructor o1 = new OverloadedConstructor(10);
		System.out.println("------------------------------------------");
		OverloadedConstructor o2 = new OverloadedConstructor(10.5);
		System.out.println("------------------------------------------");
		OverloadedConstructor o3 = new OverloadedConstructor(10l);

	}

}
