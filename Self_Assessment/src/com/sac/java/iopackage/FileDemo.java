package com.sac.java.iopackage;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();//creates new physical file in current working directory
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getPath());
		System.out.println(f.getCanonicalFile());
		File f1 = new File("sach");
		System.out.println(f1.exists());
		f1.mkdir();//creates new file/folder in current working directory
		System.out.println(f1.exists());
	}

}
