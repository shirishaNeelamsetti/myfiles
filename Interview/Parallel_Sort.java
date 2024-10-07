package com.Interview;

import java.util.Arrays;

public class Parallel_Sort {

	public static void main(String[] args) {
		int a[] = { 5, 6, 8, 7, 9, 1, 2, 3, 4 };
		System.out.println("Array before sorting:" + Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Arrays after sorting:" + Arrays.toString(a));

	}

}
