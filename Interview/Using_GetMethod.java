package com.Interview;

import java.util.ArrayList;

public class Using_GetMethod {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int a = 1; a <= 30; a++) {
			numbers.add(a);
		}
		System.out.println(numbers);
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) == 7 || numbers.get(i) == 9 || numbers.get(i) == 16 || numbers.get(i) == 29) {
				System.out.println(numbers.get(i));
			}

		}
	}

}
