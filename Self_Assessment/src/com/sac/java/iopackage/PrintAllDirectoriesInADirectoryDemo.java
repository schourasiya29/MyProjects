package com.sac.java.iopackage;

import java.io.File;

public class PrintAllDirectoriesInADirectoryDemo {

	public static void main(String[] args) {
		int count = 0;
		File f = new File("D:\\PR_SACHIN\\Self_Assessment");
		String[] s = f.list();

		for (String s1 : s) {
			File f1 = new File(f, s1);
			if (f1.isDirectory()) {
				count++;
				System.out.println(s1);
			}

		}
		System.out.println("The total no. of directories is = " + count);

	}

}
