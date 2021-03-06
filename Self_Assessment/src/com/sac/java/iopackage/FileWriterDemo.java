package com.sac.java.iopackage;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		/* if file not present in CWD this below line will create for us */
		FileWriter f = new FileWriter("abc.txt");
		f.write(115);// writing a single character 's' to the file.
		f.write("achin\nFileWriter_Demo");// writing a string to the file.
		f.write("\n");// to next line
		char[] ch = { 'a', 'b', 'c', 'd', 'f' };
		f.write(ch);// writing a character array to the file.
		f.flush();// to make sure every single character is written and nothing
					// is left
		f.close();// to close the writer

	}

}
