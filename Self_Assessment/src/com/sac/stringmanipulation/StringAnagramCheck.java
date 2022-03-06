package com.sac.stringmanipulation;

import java.util.Arrays;

public class StringAnagramCheck {

	public static void main(String[] args) {
		
		isAnagram("keep","peek");
		isAnagram("Mother In Law", "Hitler Woman");  
	}

public static void isAnagram(String str1,String str2 ){
	boolean status = true;
	String s1= str1.replaceAll("\\s", "");
	String s2= str2.replaceAll("\\s", "");
	
	if (s1.length() !=s2.length()){
		status =false;
	}
	else {
		char[] saaray1= s1.toLowerCase().toCharArray();
		char[] sarray2= s2.toLowerCase().toCharArray();
		Arrays.sort(saaray1);
		Arrays.sort(sarray2);
		status= Arrays.equals(saaray1, sarray2);
	}
	
	if (status){
		System.out.println("Given strings are anagrams");
	}
	else{
		System.out.println("Given strings are not anagrams");
	}
	
}
}
