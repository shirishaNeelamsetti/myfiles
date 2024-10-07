package com.Array;

public class Object_two_dimentional {
	public static void main(String[] args) {
		Object[][] bags = new Object[3][2];

		bags[0][0] = "dell";
		bags[0][1] = "lenova";

		bags[1][0] = "HP";
		bags[1][1] = "wildcraft";

		bags[2][0] = "Inspiron";
		bags[2][1] = "XPS";

		for (int i = 0; i <= bags.length - 1; i++) {
			for (int j = 0; j <= bags[i].length - 1; j++) {

				System.out.print(bags[i][j] + "  ");
			}

			System.out.println();
		}

		for (Object i[] : bags) {
			for (Object j : i) {
				System.out.println(j + " ");
			}
		}
	}
}
