package com.sac.practice;

//In this example only once hashcode will be printed(3 times) which is of the child object
class Parent{
	Parent(){
		System.out.println("Parent Class Hashcode " + this.hashCode());
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child Class Hashcode " +this.hashCode());
	}
}
public class ParentObjectTest {

	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println("Main Class Hashcode " +ch.hashCode());

	}

}
