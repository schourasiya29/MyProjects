package com.sac.multithreadingEnhancements;

/*-> In this program if  we replace InheritableThreadLocal with ThreadLocal and 
 *   if we are not overriding child value method then the output is: 
 *   
 *       Parent Thread value—PP
 *       Child Thread value – null.
 *-> In this program if we are maintaining InheritableThredLocal and if we are
 *   not overriding child value method then output is:
 *   
 *       Parent Thread value—PP
 *       Child Thread value – PP.
 */

class ParentThread extends Thread {
	public static InheritableThreadLocal tl = new InheritableThreadLocal() {
		public Object childValue(Object p) {
			return "CC";
		}
	};

	public void run() {
		tl.set("PP");
		System.out.println("Parent Thread Value--" + tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}

class ChildThread extends Thread {
	public void run() {
		System.out.println("Child Thread Value--" + ParentThread.tl.get());
	}
}

public class ThreadLocalDemo2 {

	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();
	}

}
