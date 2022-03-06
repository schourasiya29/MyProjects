package com.sac.stringmanipulation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GetMaxEvenLengthString {
	static String s = "Be not afraid of greatness some are born great some achieve "
			+ "greatness and some have greatness thrust upon them";

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		String[] strArr = s.split(" ");

		Predicate<String> p = s -> s.length() % 2 == 0;
		for (String s1 : strArr) {

			if (p.test(s1)) {
				l.add(s1);
			}

		}
		System.out.println(l);
		Comparator<String> c = (s1,s2)->{
				int l1 = s1.length();
				int l2 = s2.length();
				if (l1>l2)
					return -1;
				else if (l1<l2)
					return +1;
				else 
					return s1.compareTo(s2);
				
		};
		List l2 =  l.stream().sorted(c).collect(Collectors.toList());
		System.out.println(l2);
		String result = l.stream().sorted(c).limit(2).findFirst().get();
		System.out.println(result);

	}

}
