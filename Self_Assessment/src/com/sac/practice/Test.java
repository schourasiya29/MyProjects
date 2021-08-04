package com.sac.practice;

public class Test {

	public static void main(String[] args) {
		byte b = 127;
		System.out.println(b);
		
		int x = 10;
		int y = 010;
		int z = 0X10;
		int a = 0777;
		char ch =97;
		char ch1 =65535;//? as computer can't print the value of character
		char ch2= '\u0061';
		int[] ar = new int[5];
		
	    // example two dimensional array or array of arrays
		int[][] arofar= new int [3][];
		arofar[0]= new int [3];
		arofar[1]= new int [2];
		arofar[2] = new int [4];
		
		int[] arr = {10,20,30};
		System.out.println(arr.length);
		
		//new int []{2,3,4,5};//anonymous array
		
		System.out.println("value of x = " + x + " y = " +y+ " z = " +z+ " and a = " +a+" "+ ch2);
	}
	
	public void sum() {
		
	}

}
