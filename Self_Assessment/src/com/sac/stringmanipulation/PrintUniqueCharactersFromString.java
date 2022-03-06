package com.sac.stringmanipulation;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharactersFromString {

	public static void main(String[] args) {
		String s = "i love java";

		char[] ch = s.toCharArray();
		Set<Character> sett = new HashSet<>();
		for (char c : ch) {
			sett.add(c);
		}
		
		System.out.println(sett);
	}

}
