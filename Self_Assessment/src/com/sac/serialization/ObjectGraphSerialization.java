package com.sac.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog4 implements Serializable{
	Cat c = new Cat();
}

class Cat implements Serializable{
	Rat r = new Rat();
}

class Rat implements Serializable{
	int j = 20;
}

public class ObjectGraphSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog4 d = new Dog4();
		FileOutputStream fos = new FileOutputStream("abc3.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		FileInputStream fis = new FileInputStream("abc3.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog4 d1 = (Dog4) ois.readObject();
		System.out.println(d1.c.r.j);
	}

}
