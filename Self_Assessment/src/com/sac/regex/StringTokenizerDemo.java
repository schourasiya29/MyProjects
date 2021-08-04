package com.sac.regex;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		/* The default regular expression/pattern/delimiter is space '' */
		StringTokenizer st = new StringTokenizer("Durga Soft Solutions");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		System.out.println("*********************************");
		/* Example with expected delimiter */
		StringTokenizer st1 = new StringTokenizer("19-20-1993", "-");
		while (st1.hasMoreElements()) {
			System.out.println(st1.nextToken());
		}
	}

}
