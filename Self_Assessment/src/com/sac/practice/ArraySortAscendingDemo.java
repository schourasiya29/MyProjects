package com.sac.practice;

public class ArraySortAscendingDemo {

	public static void main(String[] args) {
		int arr[] = new int[] { 6, 3, 23, 19, 22, 11, 2, 1 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		for (int a : arr) {
			System.out.println(a);
		}
	}

}
