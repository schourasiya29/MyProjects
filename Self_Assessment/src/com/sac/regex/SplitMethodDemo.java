package com.sac.regex;

import java.util.regex.Pattern;

public class SplitMethodDemo {

	public static void main(String[] args) {
		//Pattern p = Pattern.compile("\\s");//Except space all are tokens
		//Pattern p = Pattern.compile("a");//except a all are tokens
		Pattern p = Pattern.compile("o");//except o remaining are tokens
		String[] s = p.split("durga software solutions");
		for (String s1 : s) {
			System.out.println(s1);
		}
	}

}
