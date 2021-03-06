package com.sac.java.iopackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*File Reader demo by using int read() method*/
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("abc.txt");
		int i = fr.read();

		/*
		 * here -1 means end of file and we need to type cast the value to get
		 * actual char value
		 */
		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();
		}

	}

}
