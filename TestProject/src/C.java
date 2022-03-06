class A {
	 void m1(){
		System.out.println("Class A m1");
	}
}

class B extends A{
	 void m1(){
		System.out.println("Class B m1");
	}
}
public class C extends B{
	 void m1(){
		System.out.println("Class C m1");
	 }
	
	public static void main(String[] args) {
		A a = new A();
		
		C c = (C) a;
		c.m1();
	}
}

