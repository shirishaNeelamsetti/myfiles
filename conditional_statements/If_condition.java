package com.conditional_statements;

public class If_condition {

	public static void main(String[] args) {
		int a = 90;
		int b = 80;
		int c = 70;
		int d = 60;
		if (a < b) {
			System.out.println("The statement a>b is true");
		} 
		else if (a < d) {
			System.out.println("The statement a>d is true ");
		} 
		else if (a > c) {
			System.out.println("The statement a>c is true");
		} 
		else if (a < b) {
			System.out.println("the statement a<b is true");
		} 
		else {
			System.out.println("The statement a>b is true");
		}
	}

}
