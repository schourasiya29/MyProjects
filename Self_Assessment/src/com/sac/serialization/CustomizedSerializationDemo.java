package com.sac.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*To recover the loss of data by transient keyword we 
 *need to perform the customized serialization, and we 
 *can do that by defining the write() and read() methods 
 *in the Accounts class and these methods will be called 
 *by JVM we don't need to call explicitly
 */
class Accounts implements Serializable {
	String name = "Sachin";
	transient String pwd = "abcdefg";

	private void writeObject(ObjectOutputStream os) throws IOException {
		os.defaultWriteObject();// to write the default object's state
		String encrypted_pwd = "12345" + pwd;// adding encryption
		os.writeObject(encrypted_pwd);// to write the encrypted pass to the file

	}

	private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
		is.defaultReadObject();// to receive the default object's state
		String encrypted_pwd = (String) is.readObject();// to receive the
														// Encrypted pass from
														// the file
		pwd = encrypted_pwd.substring(5);// removing encryption
	}

}

public class CustomizedSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Accounts a = new Accounts();
		FileOutputStream fos = new FileOutputStream("abc4.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);

		System.out.println("After Serialization name = " + a.name + "..pass = " + a.pwd);

		FileInputStream fis = new FileInputStream("abc4.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Accounts a1 = (Accounts) ois.readObject();

		System.out.println("After DeSerialization name = " + a1.name + "..pass = " + a1.pwd);
	}

}
