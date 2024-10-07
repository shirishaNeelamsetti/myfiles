package com.increment_decrement;

public class Post_incre_Decre1 {

	public static void main(String[] args) {
		int ab = 100;
		ab++;
		System.out.println(ab);// 101
		int cd = 200;
		cd = ab++;
		System.out.println(cd);// 101

//post increment
		cd++;
		System.out.println(cd);// 102
		cd = ab++;
		System.out.println(ab);// 103

//post decrement
		cd--;
		System.out.println(cd);//101
		ab=cd--;
		System.out.println(ab);//101

	}

}
