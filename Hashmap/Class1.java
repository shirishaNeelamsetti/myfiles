package com.Hashmap;

import java.util.HashMap;

public class Class1 {

	public static void main(String[] args) {
		//HashMap<datatypes> arrayname=new HashMap <datatypes>();
		HashMap<Integer, String> names = new HashMap<Integer, String>();
		names.put(66, "manisha");
		names.put(67, "vennela");
		names.put(68, "kushul");

		System.out.println(names);

		System.out.println(names.size());// size

		names.remove(68);
		System.out.println(names);// remove

		System.out.println(names.get(66));// to get specific value

		System.out.println(names.keySet());// keys set

		for (Object z : names.keySet()) {//for each loop 
			System.out.println(names.get(z));
		}
	}

}
