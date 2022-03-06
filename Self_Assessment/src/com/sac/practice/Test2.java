package com.sac.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(4);
		l.add(4);
		l.add(4);
		l.add(5);
		l.add(3);
		System.out.println(l);
		
		int[] arr = { 1, 4, 4, 4, 5, 3 };
		int type1=0;
		int type2=0;
		int type3=0;
		int type4=0;
		int type5=0;

		for (Integer i : l) {
			switch (i) {
			
			case 1: type1++;
			break;
			case 2: type2++;
			break;
			case 3: type3++;
			break;
			case 4: type4++;
			break;
			case 5: type5++;
			break;			

			}
		}
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(type1);
		l1.add(type2);
		l1.add(type3);
		l1.add(type4);
		l1.add(type5);
		//int [] newarr ={type1,type2,type3,type4,type5};
		//Collections.sort(l1);
		System.out.println(l1);
		System.out.println(l1.get(l1.size()-1));
	
	}

}
