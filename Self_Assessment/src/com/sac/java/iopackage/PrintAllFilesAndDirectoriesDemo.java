package com.sac.java.iopackage;

import java.io.File;

public class PrintAllFilesAndDirectoriesDemo {

	public static void main(String[] args) {
		int count = 0;
		File f = new File("D:\\PR_SACHIN\\Self_Assessment");
		String[] s = f.list();

		for (String s1 : s) {
			count++;
			System.out.println(s1);
		}
		System.out.println("The total no. of files and directories is = " + count);
	}

}
