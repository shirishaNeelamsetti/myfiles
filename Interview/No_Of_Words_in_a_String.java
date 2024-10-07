package com.Interview;

public class No_Of_Words_in_a_String {

	public static void main(String[] args) {
		String  bangle="round square pyramid rectangle";
		int count=1;
		for(int i=0;i<bangle.length()-1;i++) {
			if((bangle.charAt(i) == ' ') && (bangle.charAt(i + 1)!= ' ')) {
				count++;
			}
			
		}
     System.out.println("No.of words in a string : "+count);
	}

}
