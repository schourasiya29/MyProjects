package com.practice.sac;

public class Greeter {

	// Here we are not passing the behaviour in the greeting method directly,
	// instead we are passing a thing which has a behaviour.
	public void greet(Greeting greeting) {

		// System.out.println("Hello World!");
		greeting.perform();
	}

	public static void main(String[] args) {

		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		// greeter.greet(helloWorldGreeting);

		// Point 1: In order to remove the type error we must have a interface
		// which
		// matches the signature of the lambda expression

		// MyLambda myLambdaFunction = () -> System.out.print("Hello World !");
		// MyAdd myAddFunction = (int a, int b) -> a + b;

		// Point 2: Now since we already have an interface "Greeting" which
		// matches the
		// signature of the lamda expression of line 20
		// we can write the expression as.
		Greeting myLambdaFunction = () -> System.out.print("Hello World ! Lamda Exp");

		// executing the lambda exp
		//myLambdaFunction.perform();

		//

		// Point 3: Anonymous inner class concept
		Greeting innerclassGreeting = new Greeting() {

			@Override
			public void perform() {
				System.out.print("Hello World ! Anonymous Inner Class");
			}
		};
		//Executing via innerclass object 
		// executing the lambda exp
		//innerclassGreeting.perform();
		
		//executing the greet method using both 
		greeter.greet(myLambdaFunction);
		//or
		//greeter.greet(() -> System.out.print("Hello World ! Lamda Exp"));
		System.out.println();
		greeter.greet(innerclassGreeting);
		
	}

}

/*
 * interface MyLambda { void foo(); }
 * 
 * interface MyAdd { int add(int a, int b); }
 */