package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Class4 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("siri");
		names.add("mani");
		names.add("ruchi");
		names.add("hari");
		
//		System.out.println("women names are:"+names.size());
//		
//		System.out.println(names.get(3));
//		
//		System.out.println(names.set(1, "nani"));
//		System.out.println(names);
//		
//		Collections.sort(names);
//		System.out.println(names);
		
		for(int i=0;i<=names.size()-1;i++) {
			
			System.out.println(i);
			System.out.println(names.get(i));
		}
         for (String name:names) {
        	 
        	 System.out.println(name);
         }
	}

}
