package com.sac.arraymanipulation;

public class RemoveDuplicateFromArrayUsingLoop {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int[] arrNew = new int[arr.length];

		/*
		 * int count = 0; for (int i = 0; i < arr.length; i++) { for (int j = i
		 * + 1; j < arr.length - 1; j++) { if (!(arr[i] == arr[j])) {
		 * arrNew[count] = arr[i]; count++; } }
		 */

		for (int a : arrNew) {
			System.out.println(a);
		}

	}
}
