package com.conditional_statements;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		System.out.println("Enter your family name -ASM");
		Scanner ab = new Scanner(System.in);
		String name = ab.nextLine();
		ab.close();

		switch (name.toUpperCase()) {
		case "A":
			System.out.println("one of your family member is atchibabu");
			break;
		case "S":
			System.out.println("one of your family member is shanthi");
			break;
		case "M":
			System.out.println("one of your family member is manisha");
			break;
		default:
			System.out.println("invalid entry");
		}

	}

}
