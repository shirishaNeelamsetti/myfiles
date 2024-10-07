package com.Interview;

import java.util.Arrays;
import java.util.Collections;

public class Sort_values {
	public static void main(String[] args) {
		Integer a[] = { 1, 2, 3, 4, 5, 7, 9, 8, 6 };
		System.out.println("before sorting :" + Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("after sorting :" + Arrays.toString(a));

	}
}
