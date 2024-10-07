package com.Interview;

public class Prime_Numbers1 {

	public static void main(String[] args) {
		int siri;
		System.out.println("print prime numbers from 1 to 100");

		for (int i = 1; i <= 100; i++) {
			siri = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					siri++;
				}
			}
			if (siri == 2) {
				System.out.print(i + ",");
			}
		}

	}

}
