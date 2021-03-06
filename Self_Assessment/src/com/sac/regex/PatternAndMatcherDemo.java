package com.sac.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherDemo {

	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abaabaaab");
		while (m.find()) {
			count++;
			System.out.println(m.start() + ".." + m.end() + ".." + m.group());

		}
		System.out.println("Total no. of occurrences are " + count);
	}

}
