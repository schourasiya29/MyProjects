package com.sac.arraymanipulation;


public class ShiftAllZeroesToLeft {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1 };
		//Arrays.sort(arr);
		int newarr[] = new int[arr.length];
		int count = arr.length - 1;

		for (int i = arr.length - 1; i >= 0; i--) {

			if (arr[i] == 1) {
				newarr[count] = arr[i];
				count--;
			}
		}
		for (int j : newarr) {
			System.out.println(j);
		}
	}

}
