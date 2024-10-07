package com.Interview;

public class Split_Method {

	public static void main(String[] args) {
		String names = "siri mani chitti bomma potti";
		System.out.println(names);
		String a[] = names.split(" ", 5);
		for (String x : a)
			System.out.println(x);

	}

}
