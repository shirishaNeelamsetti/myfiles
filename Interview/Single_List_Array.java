package com.Interview;

import java.util.Arrays;
import java.util.List;

public class Single_List_Array {

	public static void main(String[] args) {
		String abc[] = { "hyd", "balnagar", "jdm" };
		List<String> places = Arrays.asList(abc);
		System.out.println(places);
		places.add("miyapur");
		places.add("SR nagar");
		System.out.println(places);
	}

}
