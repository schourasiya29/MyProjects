package com.sac.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNegativeIntergerFromArray {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, -2, 3, -4, 5, -6, 7, -8, 9, -10);
		List<Integer> newList = new ArrayList<Integer>(list);

		Iterator<Integer> itr = newList.iterator();
		while (itr.hasNext()) {
			if (itr.next() < 0) {
				itr.remove();
			}
		}

		System.out.println(list);
		System.out.println(newList);
	}

}
