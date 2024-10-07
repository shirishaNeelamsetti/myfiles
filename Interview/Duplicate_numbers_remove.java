package com.Interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate_numbers_remove {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 1, 3, 4, 5, 5, 6, 6, 7, 8, 9, 2);
		Set<Integer> changelist = new HashSet<Integer>(list);
		System.out.println(changelist);
		changelist.forEach(System.out::println);
	}

}
