package com.sac.practice;

public class InstanceControlFlowExample {
	int x = 10;
	{
		m1();
		System.out.println("First Instance Block");
	}

	InstanceControlFlowExample() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		/*
		 * If we will not create any object only Static control flow will work
		 * hence only 'Main Method' will be printed at the console, as soon as we
		 * create the object instance flow will work
		 */
		InstanceControlFlowExample obj = new InstanceControlFlowExample();
		System.out.println("Main Method");
		//InstanceControlFlowExample obj1 = new InstanceControlFlowExample();
	}

	public void m1() {
		System.out.println(y);
	}

	{
		System.out.println("Second Instance Block");
	}
	int y = 20;
}
