package com.Interview;

public class Two_dimentional_arrays {

	public static void main(String[] args) {
		int[][] values = new int[3][2];

		values[0][0] = 11;
		values[0][1] = 12;

		values[1][0] = 13;
		values[1][1] = 14; 

		values[2][0] = 15;
		values[2][1] = 16;

		System.out.println(values.length);
		System.out.println(values[0].length);

		for (int i = 0; i <= values.length - 1; i++) {
			for (int j = 0; j <= values[i].length - 1; j++) {
				System.out.println(values[i][j] + ",");
			}
			System.out.println();
		}

		for (int[] i : values) {
			for (int j : i) {
				System.out.println(j + ",");
			}
			System.out.println();
		}
	}
}
