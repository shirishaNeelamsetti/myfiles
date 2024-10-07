package com.Interview;

public class Words_in_a_String {

	public static void main(String[] args) {
		String heros="pawankalyan alluarjun vijay prabhas";
		int count=1;
		for(int i=0;i<=heros.length()-1;i++) {
			if(heros.charAt(i)==' ') {
				count++;
				}
		}
		System.out.println(count);

	}

}
