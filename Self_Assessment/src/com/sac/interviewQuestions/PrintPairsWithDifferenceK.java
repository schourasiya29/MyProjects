package com.sac.interviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Print the pairs where the difference of the numbers is equal to K
public class PrintPairsWithDifferenceK {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 2, 5, 4, 5, 6, 7, 8, 9, 10);
		int k = 2;

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		// Using two loops
		/*for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size() - 1; j++) {

				if (Math.abs(list.get(i) - list.get(j)) == k) {
					hm.put(list.get(i), list.get(j));
				}
			}
		}*/
		// Using single loop
		
		for (int i=0;i<list.size()-1;i++){
			if(Math.abs(list.get(i) - list.get(i+1)) == k){
				hm.put(list.get(i), list.get(i+1));
				
			}
			
		}
		
		System.out.println(hm);
	}

}
