package com.sac.stringmanipulation;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWordsInString {

	static String s = "i love java and java is the best language";
	public static void main(String[] args) {

		Map<String, Integer> hm = new HashMap();
		
		String[] s1 = s.split(" ");
		for (String s2 : s1){
			
			if (!hm.containsKey(s2)){
				hm.put(s2, 1);
			}
			else {
				hm.put(s2, hm.get(s2)+1);
			}
		}
		System.out.println(hm);
	}

}
