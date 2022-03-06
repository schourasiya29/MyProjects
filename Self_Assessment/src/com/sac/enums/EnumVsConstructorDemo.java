package com.sac.enums;

enum Beer1 {
	KF, KO, RC, FO;
	Beer1() {
		System.out.println("Constructor");
	}
}

public class EnumVsConstructorDemo {

	public static void main(String[] args) {
		/*
		 * Since every constant in enum is a static object and hence the
		 * constants will be created at the class loading time and constructor
		 * will be executed for each constant (in this case 4 times)
		 */
		Beer1 b = Beer1.KF;
		System.out.println("Hello");
	}

}
