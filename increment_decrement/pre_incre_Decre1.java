package com.increment_decrement;

public class pre_incre_Decre1 {

	public static void main(String[] args) {
		int sh = 99;
		++sh;
		System.out.println(sh);// 100
		int ir = 100;
		ir = ++sh;
		System.out.println(ir);// 101

//pre increment
		++sh;
		System.out.println(sh);// 102
		ir = ++ir;
		System.out.println(ir);// 102

//pre Decrement
		--ir;
		System.out.println(ir);// 101
		sh = --ir;
		System.out.println(sh);// 100

	}

}
