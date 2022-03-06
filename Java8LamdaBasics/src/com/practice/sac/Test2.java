package com.practice.sac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 2, 5, 4, 5, 6, 7, 8, 9, 10);
		int k = 2;

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size() - 1; j++) {

				if (Math.abs(list.get(i) - list.get(j)) == k) {
					hm.put(list.get(i), list.get(j));
				}
			}
		}
		System.out.println(hm);
	}

}
