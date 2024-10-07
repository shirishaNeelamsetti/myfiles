package com.Interview;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int s=2;
		int m=4;
		System.out.println(s);
		System.out.println(m);
		int a=s+m;
		while(a<=250) {
			System.out.println(a);
			s=m;
			m=a;
			a=s+m;
		}

	}

}
