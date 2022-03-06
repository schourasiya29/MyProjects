package com.sac.arraymanipulation;

public class ShiftAllZeroesToRight {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1 };

		int newarr[] = new int[arr.length];
		int count = 0;

		for (int i=0; i<arr.length;i++) {

			if (arr[i] == 1) {
				newarr[count] = arr[i];
				count++;
			}
		}
		for (int j : newarr){
			System.out.println(j);
		}
	}
}
