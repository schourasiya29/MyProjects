package com.sac.regex;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameExtractorDemo {

	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("[a-zA-Z0-9_.$]+[.]txt");
		File f = new File("D:\\PR_SACHIN\\Self_Assessment");
		String[] s = f.list();

		for (String s1 : s) {

			Matcher m = p.matcher(s1);
			if (m.find() && m.group().equals(s1)) {
				count++;
				System.out.println(m.group());
			}
		}
		System.out.println(count);
	}

}
