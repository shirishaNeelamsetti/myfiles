package com.Interview;

import java.util.Arrays;

public class Object_Array {

	public static void main(String[] args) {
		Object[] cars=new Object[3];
		cars[0]=100;
		cars[1]="shirisha";
		cars[2]="shirisha@123";
		
		System.out.println(Arrays.toString(cars));
		
		for(Object x:cars) {
			System.out.println(x);
		}

	}

}
