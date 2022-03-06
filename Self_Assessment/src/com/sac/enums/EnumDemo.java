package com.sac.enums;


/*Example overriding the color specific enum method*/
enum Color {
	BLUE, RED {
		public void info() {
			System.out.println("Dangerous color");
		}

	},
	GREEN;
	public void info() {
		System.out.println("Universal Color");
	}
}

public class EnumDemo {

	public static void main(String[] args) {
		Color[] c = Color.values();
		for (Color c1 : c) {
			System.out.println(c1);
			c1.info();
		}
	}

}
