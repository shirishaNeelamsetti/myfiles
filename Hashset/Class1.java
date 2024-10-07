package com.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Class1 {

	public static void main(String[] args) {
		HashSet bags = new HashSet();

		bags.add("HP");
		bags.add("76534");
		bags.add("D");
		bags.add("93.470");

		System.out.println("types of laptops:" + bags.size());// to find number of values
		System.out.println(bags);
		
		bags.remove("D");
		System.out.println(bags);

		Iterator<Object> alldata = bags.iterator();
		for (int i = 0; i <= bags.size() - 1; i++) {
			System.out.println(alldata.next());
		}
		for (Object x : bags) {
			System.out.println(x);
		}
	}

}
