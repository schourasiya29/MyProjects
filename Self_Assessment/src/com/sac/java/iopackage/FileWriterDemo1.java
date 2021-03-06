package com.sac.java.iopackage;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {

	public static void main(String[] args) throws IOException {
		/*
		 * if file not present in CWD this below line will create for us and the
		 * data will be appended not overridden and we have provided second
		 * parameter as true which is boolean append
		 */
		FileWriter f = new FileWriter("abc1.txt",true);
		f.write(115);// writing a single character 's' to the file.
		f.write("achin\nFileWriter_Demo");// writing a string to the file.
		f.write("\n");// to next line
		char[] ch = { 'a', 'b', 'c', 'd', 'f' };
		f.write(ch);// writing a character array to the file.
		f.write("\n");// to next line
		f.flush();// to make sure every single character is written and nothing
					// is left
		f.close();// to close the writer

	}

}
