package com.Interview;

import java.util.Arrays;

public class Different_Numbers {

	public static void main(String[] args) {
		java.util.ArrayList<String> b = new java.util.ArrayList<String>();
		b.addAll(Arrays.asList("10", "11", "good", "Girl"));
		for (int i = 0; i <= b.size(); i++) {
			if (b.get(i) == "10" || b.get(i) == "Girl") {
				System.out.println(b.get(i));
			}
		}

	}

}
