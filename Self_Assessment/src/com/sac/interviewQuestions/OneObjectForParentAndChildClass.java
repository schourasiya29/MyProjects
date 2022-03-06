package com.sac.interviewQuestions;

import java.util.HashMap;
import java.util.Map;

/*Design a class such that only one instance of the class and any of its sub-classes can be created. 
To clarify: 
Assume A is such a class and B is derived from A.
 B does not have any special code apart from extending A new A(); // works fine. 
new A(); // causes an exception 
new B(); // works fine as this is the first instance of B 
new B(); // causes an exception.
*/
class A_Parent {

	private static Map<Class<? extends A_Parent>, A_Parent> instances = new HashMap<>();

	public A_Parent() {
		synchronized (A_Parent.class) {
			if (instances.containsKey(this.getClass())) {
				throw new IllegalStateException();
			}
			instances.put(getClass(), this);
		}
	}
	// code of class A
}

public class OneObjectForParentAndChildClass extends A_Parent {

	public static void main(String[] args) {
		A_Parent a = new A_Parent(); // works fine.
		System.out.println(a);
		// A_Parent a1=new A_Parent(); // causes an exception

		// works fine as this is the first instance of B
		OneObjectForParentAndChildClass b = new OneObjectForParentAndChildClass();
		System.out.println(b);
		// Causes an exception
		//OneObjectForParentAndChildClass b1 = new OneObjectForParentAndChildClass();
	}
}