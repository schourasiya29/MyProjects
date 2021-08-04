package com.sac.java.iopackage;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		
		//Creates file at specified location
		File f = new File("D:\\PR_SACHIN\\Self_Assessment\\Test", "abc.text");
		f.createNewFile();

		//Creates folder in Current working directory and then creates file in it
		File f1 = new File("Test 1");
		f1.mkdir();
		File f2 = new File(f1, "abcd.txt");
		f2.createNewFile();

	}

}
