package com.sac.java.iopackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*Example to merger two files (file1.txt and file2.txt) into one file (file3.text)*/
public class FileMergerDemo {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("D:\\PR_SACHIN\\Self_Assessment\\FileExamples\\file3.txt");
		BufferedReader br = new BufferedReader(
				new FileReader("D:\\PR_SACHIN\\Self_Assessment\\FileExamples\\file1.txt"));
		String line = br.readLine();

		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}
		br = new BufferedReader(new FileReader("D:\\PR_SACHIN\\Self_Assessment\\FileExamples\\file2.txt"));
		line = br.readLine();
		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}

}
