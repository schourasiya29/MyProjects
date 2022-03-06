package com.sac.arraymanipulation;

public class ArraySortingUsingSingleLoop {

	public static void main(String[] args) {
		int[] arr = new int[] { 6, 2, 3, 45, 33, 22, 11, 0, 9, 10 };
		int temp = 0;
		// Using single loop
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i = -1;
			}

		}

		for (int a : arr) {
			System.out.println(a);
		}
	}

}
