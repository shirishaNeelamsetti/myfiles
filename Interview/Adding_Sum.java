package com.Interview;

public class Adding_Sum {

	public static void main(String[] args) {
		int[] s = { 9, 8, 7, 6, 5 };
		int sum = 0;
		for (int i : s) {
			sum = sum + i;
		}
		System.out.println(sum);

		int sum1 = 0;
		for (int i = 1; i <= 19; i++) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		System.out.println(sum1-sum);
	}
}
