package com.Interview;

public class ArrayList {

	public static void main(String[] args) {
		java.util.ArrayList<String> name = new java.util.ArrayList<String>();

		name.add("vennela");
		name.add("kushal");
		name.add("srinivas");
		name.add("shruthi");
		System.out.println(name);

		for (String s : name) {
			if (s == "vennela") {
				System.out.println(s);
			} else if (s == "shruthi") {
				System.out.println(s);
			}
		}
	}

}
