package com.Interview;

import java.util.ArrayList;
import java.util.TreeSet;

public class Duplicate {

	public static void main(String[] args) {
		ArrayList<Integer> different=new ArrayList<Integer>();
		different.add(1);
		different.add(2);
		different.add(2);
		different.add(3);
		System.out.println(different);
        TreeSet<Integer>set=new TreeSet<Integer>(different);
        ArrayList<Integer> different1=new ArrayList<Integer>(set);
        System.out.println(different1);
	}

}
