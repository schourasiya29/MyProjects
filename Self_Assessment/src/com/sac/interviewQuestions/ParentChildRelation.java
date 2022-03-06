package com.sac.interviewQuestions;


/*We have a Parent --> class with 2 methods walk() and run(). 
We have a Child  --> class which overrides both the methods(). 
Both child class methods just call their respective Super implementation. 
Parent class run() method calls --> walk().   class Parent Parent p = new Child(); p.run(); 
Tell the order in which each method is called*/
class Parent{
	
	public void walk(){
		System.out.println("Parent Walk method");
	}
	public void run(){
		System.out.println("Parent Run method calling  walk method ");
		walk();
	}
}

class Child extends Parent{
	
	public void walk(){
		System.out.println("Child Walk method calling parent walk method");
		super.walk();
	}
	public void run(){
		System.out.println("Child run method calling Parent Run method");
		super.run();
	}
}


public class ParentChildRelation {

	public static void main(String[] args) {
		Parent p = new Child();
		p.run();

	}

}
