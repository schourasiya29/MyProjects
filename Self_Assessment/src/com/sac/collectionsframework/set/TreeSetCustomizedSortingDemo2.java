package com.sac.collectionsframework.set;


import java.util.Comparator;
import java.util.TreeSet;

/*Customized sorting -> Reverse sorting order for strings*/
public class TreeSetCustomizedSortingDemo2 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator2());
		t.add("Sachin");
		t.add("Bawa");
		t.add("Anshul");
		t.add("Abhishek");
		t.add("Samyak");
		t.add("Nitin");
		System.out.println(t);
	}

}

class MyComparator2 implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		String s1 = (String) arg0;
		String s2 = arg1.toString();
		return s2.compareTo(s1);
		/*or*/
		//return -s1.compareTo(s2);
	}
	
}