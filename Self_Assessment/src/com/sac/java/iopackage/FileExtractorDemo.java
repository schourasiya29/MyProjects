package com.sac.java.iopackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*Example file extractor where output =input-delete*/
public class FileExtractorDemo {

	public static void main(String[] args) throws IOException {
		final String outputFile = "D:\\PR_SACHIN\\Self_Assessment\\FileExamples\\ExtractorEx\\output.txt";
		final String inputFile = "D:\\PR_SACHIN\\Self_Assessment\\FileExamples\\ExtractorEx\\input.txt";
		final String deletefile = "D:\\PR_SACHIN\\Self_Assessment\\FileExamples\\ExtractorEx\\delete.txt";

		PrintWriter pw = new PrintWriter(outputFile);
		BufferedReader br1 = new BufferedReader(new FileReader(inputFile));
		String line = br1.readLine();
		while (line != null) {
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader(deletefile));
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
			}
			line = br1.readLine();
		}
		pw.flush();
		br1.close();
	}

}
