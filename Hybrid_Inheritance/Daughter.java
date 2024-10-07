package com.Hybrid_Inheritance;

public class Daughter extends Parent {
	public void d() {
		System.out.println("my name is shirisha");
	}

	public static void main(String[] args) {
		Daughter dd = new Daughter();
		dd.gp1();
		dd.p1();
		dd.d();
	}

}
