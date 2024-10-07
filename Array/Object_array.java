package com.Array;

public class Object_array {

	public static void main(String[] args) {
		Object[] marks = new Object[3];

		marks[0] = 59;
		marks[1] = "eighty five";
		marks[2] = "A";
		
		for (Object xyz:marks) {
			System.out.println(xyz);
		}
	}

}
