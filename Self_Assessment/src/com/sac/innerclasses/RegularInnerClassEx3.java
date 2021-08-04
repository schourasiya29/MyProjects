package com.sac.innerclasses;

/*Example: Accessing Inner class code from Outside of outer class*/
class OuterClass2 {
	class InnerClass2 {
		public void m1() {
			System.out.println("Inner class normal method");
		}
	}
}

public class RegularInnerClassEx3 {
	public static void main(String[] args) {
		OuterClass2 o = new OuterClass2();
		OuterClass2.InnerClass2 i = o.new InnerClass2();
		i.m1();
	}
}
 