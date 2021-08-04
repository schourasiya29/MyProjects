package com.sac.java.iopackage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* File Reader Demo by using int read(char[] ch) method */
public class FileReaderDemo1 {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		FileReader fr = new FileReader(f);
		char[] ch = new char[(int) f.length()];// since f.length returns long
												// value we need to typecast to
												// int as char size can be int
												// not long
		int i = fr.read(ch);// In this line all the characters are copied to the
							// char array ch

		for (char ch1 : ch) {
			System.out.print(ch1);
		}
		System.out.println("");
		System.out.println("No. of character present in the file = " + i);
	}

}
