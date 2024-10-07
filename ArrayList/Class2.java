package com.ArrayList;

import java.util.ArrayList;

public class Class2 {
	public static void main(String[] args) {
		// Arraylist<datatype>Arrayname=new Arraylist<datatype>();
		ArrayList<String> names = new ArrayList<String>();
		names.add("pavitra");
		names.add("vennela");
		names.add("manasa");
		names.add("mounika");

		System.out.println("names of selected students :" + names.size());
		System.out.println(names.get(2));// get method
		System.out.println(names.get(0));

		names.set(2, "shirisha");// to change 2nd index value
		System.out.println(names);

		names.remove(3);// to remove 2nd value
		System.out.println(names);

		names.clear();// to clear the values
		System.out.println(names);

		names.size();// to known the size 
		System.out.println(names);

	}
}
