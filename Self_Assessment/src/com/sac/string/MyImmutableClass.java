package com.sac.string;

public final class MyImmutableClass {
	private int i;

	MyImmutableClass(int i) {
		this.i = i;

	}

	public MyImmutableClass modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return (new MyImmutableClass(i));
		}

	}

	public static void main(String[] args) {
		MyImmutableClass obj1 = new MyImmutableClass(10);
		MyImmutableClass obj2 = obj1.modify(100);
		MyImmutableClass obj3 = obj1.modify(10);
		System.out.println(obj1==obj2);
		System.out.println(obj1==obj3);
		
		
	}

}
