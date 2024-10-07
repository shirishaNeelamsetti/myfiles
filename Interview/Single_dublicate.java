package com.Interview;

public class Single_dublicate {

	public static void main(String[] args) {
		int str[] = { 1, 4, 3, 5, 0, 8, 2,1 };
		for (int i = 0; i <= str.length - 1; i++) {
			for (int j = i + 1; j <= str.length; j++) {
				if (str[i] == str[j]) {
					System.out.println("The Duplicate number:" + str[j]);
				}
			}
		}
	}

}
