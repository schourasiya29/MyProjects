package com.sac.java.iopackage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("xyz1.txt");
		PrintWriter out = new PrintWriter(fw);
		out.write(100);// writes corresponding unicode character i.e. 'd'
		out.println(100);// writes corresponding int value in the same line then
							// enters next line
		out.println(true);
		char[] ch = { 'a', 'b', 'c', 'd', 'e' };
		out.println(ch);
		out.println("Print Writer Demo");
		out.flush();
		out.close();

	}

}
