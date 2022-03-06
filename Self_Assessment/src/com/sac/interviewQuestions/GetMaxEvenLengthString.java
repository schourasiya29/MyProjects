package com.sac.interviewQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetMaxEvenLengthString {
	static String s = "Be not afraid of greatness some are born great some achieve "
			+ "greatness and some have greatness thrust upon them";

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		String[] strArr = s.split(" ");

		Stream s = Stream.of(strArr);

		List<String> listeven = (List<String>) s.filter(s1 -> s1.toString().length() % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(listeven);


		List<String> levensortedDesc = listeven.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
		System.out.println("leven2= "+levensortedDesc);

		String result = levensortedDesc.stream().limit(2).findFirst().get();
		System.out.println("Result= "+result);

	}

}
