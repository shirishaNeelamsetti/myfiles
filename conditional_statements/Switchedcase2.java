package com.conditional_statements;

import java.util.Scanner;

public class Switchedcase2 {

	public static void main(String[] args) {
		int daynumber;
		String day;
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter any number from 1 to 7");
		daynumber = ab.nextInt();

		switch (daynumber) {
		case 1:
			day = "sunday";
			break;
		case 2:
			day = "monday";
			break;
		case 3:
			day = "tuesday";
			break;
		case 4:
			day = "wednesday";
			break;
		case 5:
			day = "thursday";
			break;
		case 6:
			day = "friday";
			break;
		case 7:
			day = "saturday";
		default:
			day = "invalid";

		}
         System.out.println(day);
	}

}
