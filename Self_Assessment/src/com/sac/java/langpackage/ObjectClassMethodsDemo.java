package com.sac.java.langpackage;

import java.lang.reflect.Method;

public class ObjectClassMethodsDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		int count = 0;
		Class c = Class.forName("java.lang.Object");
		Method[] m = c.getDeclaredMethods();
		for (Method m1 : m) {
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("The no. of methods in Object Class = " + count);
	}

}
