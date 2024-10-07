package com.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicatenum_list {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 2, 3, 4));
		System.out.println("arraylist with duplicate numbers is:" + num);
		Set<Integer> siri = new LinkedHashSet<Integer>();
		siri.addAll(num);
		System.out.println(siri);	
		num.clear();
		System.out.println(num);
	}

}
