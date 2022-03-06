package com.sac.enums;

enum Beer2 {
	KF(70), KO(80), RC(90), FO;
	int price;

	Beer2(int price) {
		this.price = price;
	}

	Beer2() {
		this.price = 65;
	}

	public int getPrice() {
		return price;
	}
}

public class EnumVsConstructorDemo1 {

	public static void main(String[] args) {
		Beer2[] b = Beer2.values();
		for (Beer2 b1 : b) {
			System.out.println(b1 + "..." + b1.getPrice());
		}

	}

}
