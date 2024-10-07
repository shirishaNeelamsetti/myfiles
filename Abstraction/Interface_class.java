package com.Abstraction;

interface biodata {
	public void name();

	public void age();

	public void gender();

	public void office();

	public void father_name();

	public void mother_name();

	public void siblings();
}

class my_biodata implements biodata {

	@Override
	public void name() {
		String Name = "Shirisha";
		System.out.println("my name is: " + Name);
	}

	@Override
	public void age() {
		int Age = 22;
		System.out.println("shirisha age is :" + Age);
	}

	@Override
	public void gender() {
		String Gender = "women";
		System.out.println("gender of shirisha is :" + Gender);
	}

	@Override
	public void office() {
		String Office = "shirisha will join in IBM company";
		System.out.println(Office);
	}

	@Override
	public void father_name() {
		String Father = "Atchi babu";
		System.out.println("shirisha father name is :" + Father);
	}

	@Override
	public void mother_name() {
		String Mother = "Shanthi";
		System.out.println("Shirisha mother name is :" + Mother);
	}

	@Override
	public void siblings() {
		String Sister = "Manisha";
	}

}

public class Interface_class {

	public static void main(String[] args) {
		biodata bd = new my_biodata();
		bd.name();
		bd.age();
		bd.gender();
		bd.office();
		bd.father_name();
		bd.mother_name();
		bd.siblings();
	}

}
