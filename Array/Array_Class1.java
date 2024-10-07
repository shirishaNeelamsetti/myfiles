package com.Array;

import java.util.Arrays;

public class Array_Class1 {

	public static void main(java.lang.String[] args) {
		java.lang.String[] cars = new java.lang.String[3];
		cars[0] = "volvo";
		cars[1] = "skoda";
		cars[2] = "BWM";
		System.out.println("TO find how many cars are there:" + cars.length);

		System.out.println(Arrays.toString(cars));

		System.out.println(cars[1]);
		System.out.println(cars[2]);

		
		for (int i = 0; i <= cars.length - 1; i++) {
			System.out.println(cars[i]);
			System.out.println(i);
			

		}
		for (java.lang.String shirisha : cars) {
			
		System.out.println(shirisha);
	}
}
}