package com.Interview;

public class Upper_Lower {

	public static void main(String[] args) {
		String names = "SHruthi THRInadh";
		int upper = 0, lower = 0;
		for (int i = 0; i <= names.length() - 1; i++) {
			char ch = names.charAt(i);

			if (ch >= 65 && ch <= 90) {
				upper++;
			} else {
				lower++;
			}
		}
		System.out.println(upper);
		System.out.println(lower);
	}

}
