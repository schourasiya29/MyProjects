package com.sac.regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIDExtractorRegexDemo {

	public static void main(String[] args) throws IOException {
		String output = "D:\\PR_SACHIN\\Self_Assessment\\RegExExamples\\output.txt";
		String input = "D:\\PR_SACHIN\\Self_Assessment\\RegExExamples\\input.txt";
		PrintWriter pw = new PrintWriter(output);
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		BufferedReader br = new BufferedReader(new FileReader(input));
		String line = br.readLine();

		while (line != null) {
			Matcher m = p.matcher(line);
			while (m.find()) {
				pw.println(m.group());
			}
			line = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}

}
