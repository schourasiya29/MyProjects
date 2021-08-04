package com.sac.java.iopackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*Example remove duplicates from input file and paste in output file*/
public class FileDuplicateEliminatorDemo {

	public static void main(String[] args) throws IOException {
		final String outputFile = "D:\\PR_SACHIN\\Self_Assessment\\FileExamples\\DuplicateEliminatorEX\\output.txt";
		final String inputFile = "D:\\PR_SACHIN\\Self_Assessment\\FileExamples\\DuplicateEliminatorEX\\input.txt";

		PrintWriter pw = new PrintWriter(outputFile);
		BufferedReader br1 = new BufferedReader(new FileReader(inputFile));
		String line = br1.readLine();
		while (line != null) {
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader(outputFile));
			String target = br2.readLine();
			while (target != null) {
				if (line.equals(target)) {
					available = true;
					break;
				}
				target = br2.readLine();
			}
			if (available == false) {
				pw.println(line);
				pw.flush();
			}
			line = br1.readLine();
		}

	}

}
