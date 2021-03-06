package com.sac.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*Example showing multiple transient variables and their serialization and deserialization*/
class Account implements Serializable {
	String username = "sachin";
	transient String pwd = "ABCDEF";
	transient int pin = 1234;

	private void writeObject(ObjectOutputStream os) throws IOException {
		os.defaultWriteObject();
		String epwd = "1234" + pwd;
		os.writeObject(epwd);
		int epin = pin + 4444;
		os.writeInt(epin);
	}

	private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		pwd = epwd.substring(4);
		int epin = is.readInt();
		pin = epin - 4444;
	}
}

public class CustomizedSerializationDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account a1 = new Account();
		FileOutputStream fos = new FileOutputStream("abc5.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		System.out.println("After Serialization " + a1.username + ".." + a1.pwd + ".." + a1.pin);

		FileInputStream fis = new FileInputStream("abc5.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		System.out.println("After DeSerialization " + a2.username + ".." + a2.pwd + ".." + a2.pin);
	}

}
