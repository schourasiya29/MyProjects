package com.sac.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*If we use transient keyword the original value of the variable will not 
 * be serialized instead its default value will be serialized
 */
class Dog1 implements Serializable {
	int i = 10;
	transient int j = 20;
	String name = "sachin";
	transient String password = "Abcdef";

}

public class TransientKeywordDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog1 d = new Dog1();
		/* The below three lines represents Serialization */
		FileOutputStream fos = new FileOutputStream("abcd.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);

		/* The below three lines represents Deserialization */
		FileInputStream fis = new FileInputStream("abcd.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog1 d2 = (Dog1) ois.readObject();
		System.out.println(d2.i + "......" + d2.j + "...." + d2.name + "...." + d2.password);
	}

}
