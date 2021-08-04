package com.sac.java.iopackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("xyz.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch = { 'a', 'b', 'c', 'd', 'e' };
		bw.write(ch);
		bw.newLine();
		bw.write("Buffered Writer Example");
		bw.flush();
		bw.close();
	}

}
