package com.sac.externalization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*If we want to save part of a object we should go for externalization, 
 * for this we must override the writeExternal() and readExternal() 
 * methods and must have a public no-arg constructor in the externalizable 
 * class*/
public class ExternalizationDemo implements Externalizable {
	String s;
	int i;
	int j;

	public ExternalizationDemo() {
		System.out.println("No-arg constructor is called");
	}

	public ExternalizationDemo(String s, int i, int j) {
		this.s = s;
		this.i = i;
		this.j = j;

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(i);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		 s = (String) in.readObject();
		 i = in.readInt();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ExternalizationDemo e1 = new ExternalizationDemo("durga", 10, 20);
		FileOutputStream fos = new FileOutputStream("abc6.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);

		FileInputStream fis = new FileInputStream("abc6.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizationDemo e2 = (ExternalizationDemo) ois.readObject();
		System.out.println("After desrialization values are " + e2.s + ".." + e2.i + ".." + e2.j);
	}
}
