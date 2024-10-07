package com.Array;

import java.util.Arrays;

public class Without_ArrayList {
	public static void main(String[] args) {

		int array[] = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0 };
		int siri;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					siri = array[i];
					array[i] = array[j];
					array[j] = siri;

				}
			}

		}
		System.out.println(Arrays.toString(array));
	}
}