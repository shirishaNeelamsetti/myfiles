package com.Interview;

public class Two2_D_array {

	public static void main(String[] args) {
		String[][] cars = new String[3][2];
		cars[0][0] = "volvo";
		cars[0][1] = "bwm";

		cars[1][0] = "hundai";
		cars[1][1] = "santro";

		cars[2][0] = "tata";
		cars[2][1] = "skoda";

		System.out.println(cars.length);// row
		System.out.println(cars[0].length);// column

		for (int i = 0; i <= cars.length - 1; i++) {
			for (int j = 0; j <= cars[i].length - 1; j++) {
				System.out.print(cars[i][j] + ",");
			}
			System.out.println();
		}
		for (String i[] : cars) {
			for (String j : i) {
				System.out.println(j);
			}
		}
	}

}
