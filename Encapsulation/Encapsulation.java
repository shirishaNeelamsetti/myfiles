package com.Encapsulation;

class Encapsulation123 {
	private String present_Place;
	private int present_num;
	private int present_Age;

	public void setpresent_Place(String present_Place) {
		this.present_Place = present_Place;
	}

	public String Getpresent_Place() {
		return present_Place;
	}

	public void setpresent_num(int present_num) {
		this.present_num = present_num;
	}

	public int Getpresent_num() {
		return present_num;
	}

	public void setpresent_Age(int present_Age) {
		this.present_Age = present_Age;
	}

	public int Getpresent_Age() {
		return present_Age;

	}

}

public class Encapsulation {

	public static void main(String[] args) {
		Encapsulation123 e = new Encapsulation123();
		e.setpresent_Place("jeedimetla");
		System.out.println("shirisha will stay in a place called " + e.Getpresent_Place());
		e.setpresent_Age(22);
		System.out.println("shirisha age is " + e.Getpresent_Age());
		e.setpresent_num(12345);
		System.out.println("shirisha num is " + e.Getpresent_num());
	}

}
