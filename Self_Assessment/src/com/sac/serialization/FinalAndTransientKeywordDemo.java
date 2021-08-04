package com.sac.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog3 implements Serializable {
	int i = 10;
	transient final int j = 20;// Final variables will be participating in the
								// serialization directly by their value and
								// hence declaring a final variable as transient
								// there is no impact or use
}

public class FinalAndTransientKeywordDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog3 d = new Dog3();
		/* The below three lines represents Serialization */
		FileOutputStream fos = new FileOutputStream("abc2.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);

		/* The below three lines represents Deserialization */
		FileInputStream fis = new FileInputStream("abc2.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog3 d2 = (Dog3) ois.readObject();
		System.out.println(d2.i + "......" + d2.j);
	}

}
