package com.Abstraction;

abstract class parent {
	abstract void father();

	abstract void mother();
}

abstract class parent2 {
	public void p1() {
		String name = "manisha";
		System.out.println("my daughter name is :" + name);
	}

	public void p2() {
		String name = "shirisha";
		System.out.println("my 2nd daughter name is:" + name);

	}
}

class child1 extends parent {
	public void daughter() {
		System.out.println("i'm studying Btech");

	}

	@Override
	void father() {
		String dad = "Atchibabu";
		System.out.println("my father name is:" + dad);
	}

	@Override
	void mother() {
		String mom = "Shanthi";
		System.out.println("my mother name is:" + mom);
	}

}

class child2 extends parent2 {
	public void daughter2() {
		String daughter2 = "shirisha";
		System.out.println("i'm studying degree" + daughter2);
	}
}

public class Abstract_Class {

	public static void main(String[] args) {
		child1 c = new child1();
		c.daughter();
		parent p = new child1();
		p.father();
		p.mother();
		child2 c2 = new child2();
		c2.daughter2();
		parent2 p1 = new child2();
		p1.p1();
		p1.p2();

	} 

}
