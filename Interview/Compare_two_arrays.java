package com.Interview;

import java.util.Arrays;

public class Compare_two_arrays {

	public static void main(String[] args) {
		int[]a= {1,23,34,45};
		int[]b= {1,23,34,45};
		if(Arrays.equals(a,b)) {
			System.out.println("both the arrays are equal");
		}
		else {
			System.out.println("both the arrays are not equal`");
		}

	}

}
