package com.sac.stringmanipulation;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesOfCharactersInString {

	static String s = "i love java and java is the best language";

	public static void main(String[] args) {

		char charArr[] = s.toCharArray();

		Map<Character, Integer> hm = new HashMap<>();

		for (Character c : charArr) {

			if (hm.containsKey(c)) {

				hm.put(c, hm.get(c) + 1);

			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		
		//To ingnore the space use code if (!String.valueOf(c).isBlank)

	}

}