package com.increment_decrement;

public class Post_incre_decre {

	public static void main(String[] args) {
		int g = 70;
		System.out.println(g);// 70
		g++;
		System.out.println(g);// 71
		System.out.println("------------");

//post increment
		int d = 10;
		d++;
		System.out.println(d);// 11
		int s = d++;
		System.out.println(s);// 11
		System.out.println(d);// 12
		System.out.println("-------------");

//post decrement
		int m = 25;
		m--;
		System.out.println(m);// 24
		int q = m--;
		System.out.println(q);// 24
		System.out.println(m);// 23
		s--;
		System.out.println(s);// 10
	}

}
