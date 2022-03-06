package com.sac.enums;

enum Beer {
	KF, KO, RC, FO;
}

public class EnumClassMethodDemo {

	public static void main(String[] args) {
		Beer[] b = Beer.values();
		for (Beer b1 : b) {
			System.out.println(b1 + "...." + b1.ordinal());

		}
	}

}
