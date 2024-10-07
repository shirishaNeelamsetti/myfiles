package com.Array;

public class String {

	public static void main(java.lang.String[] args) {
		java.lang.String siri1 = "madam";
		java.lang.String siri2 = "madam";
		java.lang.String siri3 = new java.lang.String("madam");

		System.out.println(siri1 == siri2);
		System.out.println(siri2 == siri3);
		System.out.println(siri1.equals(siri3));
		java.lang.String siri4 = new java.lang.String("madam");
		System.out.println(siri3 == siri4);

		java.lang.String siri6 = siri3;
		System.out.println(siri3 == siri6);
		System.out.println(siri3.equals(siri4));

	}

}
