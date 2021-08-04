package com.sac.java.langpackage;

class Cat1 {
	int j;

	Cat1(int j) {
		this.j = j;
	}
}

class Dog1 implements Cloneable {
	Cat1 c;
	int i;

	Dog1(Cat1 c, int i) {
		this.c = c;
		this.i = i;
	}

	public Object clone() throws CloneNotSupportedException {
		Cat1 c1 = new Cat1(c.j);
		Dog1 d = new Dog1(c1, i);
		return d;

	}
}

public class DeepCloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Cat1 c = new Cat1(20);
		Dog1 d1 = new Dog1(c, 10);
		System.out.println("Values before clone " + d1.i + "...." + d1.c.j);
		Dog1 d2 = (Dog1) d1.clone();
		d2.c.j = 999;
		d2.i = 888;
		System.out.println("Values after clone " + d1.i + "...." + d1.c.j);

	}

}
