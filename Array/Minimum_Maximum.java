package com.Array;

import java.util.Arrays;

public class Minimum_Maximum {

	public static void main(String[] args) {
		int array[] = { 9, 6, 4, 2, 0, 5, 3, 1, 7, 8 };
		int min = Arrays.stream(array).min().getAsInt();
		System.out.println(min);

		int max = Arrays.stream(array).max().getAsInt();
		System.out.println(max);
	}

}
