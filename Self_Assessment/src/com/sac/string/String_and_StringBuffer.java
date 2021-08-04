package com.sac.string;

public class String_and_StringBuffer {

	public static void main(String[] args) {
		String s1 = new String("durga");
		String s2 = new String("durga");
		StringBuffer sb1 = new StringBuffer("durga");
		StringBuffer sb2 = new StringBuffer("durga");

		System.out.println(s1 == s2);
		/*
		 * Equals method overridden in String class for content comparison hence
		 * will give true as output
		 */
		System.out.println(s1.equals(s2));
		System.out.println(sb1 == sb2);
		/*
		 * Equals method not overridden in String buffer class for content
		 * comparison hence will give false as output
		 */
		System.out.println(sb1.equals(sb2));

		// System.out.println(s1==sb1);//compile time error as both are
		// different object types
		System.out.println(s1.equals(sb1));// simply returns false

	}

}
