package com.Interview;

import java.util.Scanner;

public class Factorial_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = sc.nextInt();
		sc.close();
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of" + number + "is:" + fact);

	}

}
