package com.increment_decrement;

public class Pre_incre_decre {

	public static void main(String[] args) {
		int t = 50;
//pre increment
		++t;
		System.out.println(t);// 51
		int z = ++t;
		System.out.println(z);// 52
		++z;
		System.out.println(z);// 53

//pre decrement
		--t;
		System.out.println(t);// 51
		int x = --t;
		System.out.println(x);// 50
		--z;
		System.out.println(z);// 52

	}

}
