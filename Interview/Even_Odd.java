package com.Interview;

public class Even_Odd {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("even numbers in a array");
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
       for(int i=0;i<=a.length-1;i++) {
    	   if(a[i]%2!=0) {
    		   System.out.println(a[i]);
    		   
    	   }
       }
	}

}
