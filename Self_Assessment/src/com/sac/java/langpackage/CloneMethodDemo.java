package com.sac.java.langpackage;

/*if we will not implement cloneable then we will get runtime exception saying clonenotsupported exception*/
public class CloneMethodDemo implements Cloneable {

	int i = 10;
	int j = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneMethodDemo c1 = new CloneMethodDemo();
		CloneMethodDemo c2 = (CloneMethodDemo) c1.clone();
		c2.i = 888;
		c2.j = 999;
		System.out.println("c1.i= "+c1.i + " and " +"c1.j= "+ c1.j);
		System.out.println("c2.i= "+c2.i + " and " +"c2.j= "+ c2.j);
	}

}
