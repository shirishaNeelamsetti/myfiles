package com.increment_decrement;

public class pre_post_incre_decre {

	public static void main(String[] args) {
		// increment
		int q = 90;
		q++;
		System.out.println(q);// 91
		int w = q++;
		System.out.println(q);// 92

//decrement
		w--;
		System.out.println(w);// 90
		q--;
		System.out.println(q);// 91

//pre increment
		int m = ++q;
		System.out.println(m);// 92
		q = ++m;
		System.out.println(q);// 93

//pre decrement
		q = --m;
		System.out.println(q);// 92
		int s = --q;
		System.out.println(s);// 91

//post increment 
		int b = 20;
		b++;
		System.out.println(b);// 21
		q++;
		System.out.println(q);// 92

//post decrement
		w--;
		System.out.println(w);// 89
		int c = 80;
		b = --c;
		System.out.println(b);// 79

	}

}
