package com.sac.collectionsframework.cursors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsDemo {

	/*
	 * Here we are not creating the objects of the Enumeration(I),Iterator(I)
	 * and ListIterator(I) interfaces instead their implementation classes which
	 * are printed below
	 */
	public static void main(String[] args) {
		Vector v = new Vector();
		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator litr = v.listIterator();
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(litr.getClass().getName());

		System.out.println("****************************");

		ArrayList l = new ArrayList();
		/* Enumeration is legacy cursor can apply for Vector and stack only */
		// Enumeration e1 = l.elements();
		Iterator itr1 = l.iterator();
		ListIterator litr1 = l.listIterator();
		System.out.println(itr1.getClass().getName());
		System.out.println(litr1.getClass().getName());

	}

}
