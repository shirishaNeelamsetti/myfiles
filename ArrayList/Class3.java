package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Class3 {

	public static void main(String[] args) {
		ArrayList<String> javatopics = new ArrayList<String>();
		javatopics.add("scannerclass");
		javatopics.add("datatypes");
		javatopics.add("operators");
		javatopics.add("arrays");

		System.out.println("my overall topics is:" + javatopics.size());
		System.out.println("------------------");

		System.out.println(javatopics.get(2));
		System.out.println("------------------");

		System.out.println(javatopics.set(3, "arraylist"));
		System.out.println(javatopics);
		System.out.println("------------------");

		System.out.println(javatopics.remove(0));
		System.out.println(javatopics);
		System.out.println("------------------");

		Collections.sort(javatopics);
		System.out.println(javatopics);
		System.out.println("------------------");

		for (int i = 0; i <= javatopics.size()-1; i++) {
			System.out.println(i);
			System.out.println(javatopics.get(i));
			System.out.println("------------------");

			for(String java: javatopics) {
				System.out.println(java);
			}

		}

	}

}
