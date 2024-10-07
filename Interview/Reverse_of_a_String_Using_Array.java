package com.Interview;

public class Reverse_of_a_String_Using_Array {

	public static void main(String[] args) {
String name="shirisha";
String reverse="";
//usimg chartAT array 
char s[]=name.toCharArray();
int length=s.length;
System.out.println(length);
for(int i=length-1;i>=0;i--) {
	reverse=reverse+s[i];
	System.out.println("reverse string is:"+reverse);
}
	}

}
