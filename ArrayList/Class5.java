package com.ArrayList;

import java.util.ArrayList;

public class Class5 {

	public static void main(String[] args) {
		ArrayList<String> places=new ArrayList<String>();
		places.add("Mindq");
		places.add("Netrich");
		places.add("Naresh IT");
		
		System.out.println(places);
		
		for(int i=0;i<=places.size()-1;i++) {
			System.out.println(places.get(i));
			System.out.println();
			
			if (places.get(i).equals("Mindq")) {
				places.set(i,"woody");
				System.out.println(places);
				break;
			}
		}

	}

}
