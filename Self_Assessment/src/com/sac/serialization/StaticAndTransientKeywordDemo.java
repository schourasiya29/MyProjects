package com.sac.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog2 implements Serializable {
	int i = 10;
	transient static int j = 20;// Static variables are not part of an Object's
								// state hence they will not participate in the
								// serialization process and due to this
								// declaring a static variable as transient
								// there is no impact or use

}

public class StaticAndTransientKeywordDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog2 d = new Dog2();
		/* The below three lines represents Serialization */
		FileOutputStream fos = new FileOutputStream("abc1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);

		/* The below three lines represents Deserialization */
		FileInputStream fis = new FileInputStream("abc1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog2 d2 = (Dog2) ois.readObject();
		System.out.println(d2.i + "......" + d2.j);
	}

}
