package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Class1 {

	public static void main(String[] args) {
		// Arraylist<datatype> Arrayname=new Arraylist<datatype>
		ArrayList<String> places = new ArrayList<String>();
		places.add("Hyderabad");
		places.add("secendrabad");
		places.add("balnagar");
		
		System.out.println(places);
		Collections.sort(places);
		System.out.println(places);

	}

}
