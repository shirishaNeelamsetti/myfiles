package com.Interview;

public class Find_number_of_same_letters {

	public static void main(String[] args) {
		String str = "vennela vennela vennela";
		int cnt = 0;
		for (int i = 0; i <= str.length() - 1; i++) {

			if (str.charAt(i) == 'n') {
				cnt++;
				System.out.println("index of n is: " + i);
			}

		}
		System.out.println("Number of times e occurence is in a given string is: " + cnt);

	}

}
