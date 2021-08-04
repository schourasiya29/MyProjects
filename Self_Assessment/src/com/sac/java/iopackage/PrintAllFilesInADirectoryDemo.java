package com.sac.java.iopackage;

import java.io.File;

public class PrintAllFilesInADirectoryDemo {

	public static void main(String[] args) {
		int count = 0;
		File f = new File("D:\\PR_SACHIN\\Self_Assessment");
		String[] s = f.list();

		for (String s1 : s) {
			/*
			 * since here we cant call isFile() method on string object hence we
			 * need to create a new File object which contains all the Files and
			 * Directories references
			 */
			File f1 = new File(f, s1);
			if (f1.isFile()) {
				count++;
				System.out.println(s1);
			}

		}
		System.out.println("The total no. of files is = " + count);

	}

}
