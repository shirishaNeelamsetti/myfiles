package com.Interview;

public class Sum_of_elements {

	public static void main(String[] args) {
		int[] a = { 11, 12, 13, 14, 15 };
		int sum = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

	}

}
