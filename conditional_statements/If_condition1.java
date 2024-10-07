package com.conditional_statements;

public class If_condition1 {

	public static void main(String[] args) {
		int a = 45;
		int sh = 35;
		int m = 24;
		int s = 22;
		if ((a < sh) && (sh > m) || (m < s)) {
			System.out.println("condition 1:shirisha is smaller than all");
		}
		else if ((m > sh) || (s > m) && (sh > m) || (a > s) && (m > sh)) {
			System.out.println("condition 2:shirisha is smaller than all");
		} 
		else if ((a <sh) || (sh < m) || (s > m) || (s > a) && (sh > a)) {
			System.out.println("condition 3:shirisha is smaller than all");
		}
		else if ((a < sh) && (sh < m) && (m < s) && (a < m) && (sh < s) || (s > a)
				|| (m < a) && (a < s) && (sh > s)) {
			System.out.println("condition 4:shirisha is smaller than all");
		} 
		else {
			System.out.println("condition 5:shirisha is smaller than all");
		}
	}
}