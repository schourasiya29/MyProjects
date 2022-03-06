package com.sac.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public final class ImmutablePersonClass {

	private final String name;

	private final List<String> degrees;

	public ImmutablePersonClass(String name, List<String> degrees) {
		super();
		this.name = name;

		/*List<String> newList = new ArrayList<String>();

		for (String s : degrees) {
			newList.add(s);
		}
		this.degrees = newList;*/
		this.degrees= new ArrayList<>(degrees);
	}

	public String getName() {
		return name;
	}

	public List<String> getDegrees() {
		/*List<String> newList = new ArrayList<String>();

		for (String s : degrees) {
			newList.add(s);
		}
		return newList;*/
		return new ArrayList<>(degrees);
		//return degrees;
	}

	@Override
	public String toString() {
		return "ImmutablePersonClass [name=" + name + ", degrees=" + degrees + "]";
	}

	public static void main(String[] args) {
		// List<String> degrees = Arrays.asList("BE", "BTECH");
		List<String> listDeg = new ArrayList<>();
		listDeg.add("BE");
		listDeg.add("ME");

		ImmutablePersonClass p1 = new ImmutablePersonClass("Sachin", listDeg);
		ImmutablePersonClass p2 = new ImmutablePersonClass("Sonu", listDeg);
		System.out.println(p1);
		System.out.println(p2);

		listDeg.add("BTECH");
		listDeg.add("MTECH");

		System.out.println(p1.getDegrees());
		System.out.println(p2.getDegrees());

	}

}
