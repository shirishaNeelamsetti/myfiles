package com.Array;

public class Two_dimentional_array {

	public static void main(java.lang.String[] args) {
		java.lang.String[][] names = new java.lang.String[4][2];

		names[0][0] = "neelamsetti";
		names[0][1] = "atchibabu";

		names[1][0] = "neelamsetti";
		names[1][1] = "shanthi";

		names[2][0] = "neelamsetti";
		names[2][1] = "manisha";

		names[3][0] = "neelamsetti";
		names[3][1] = "shirisha";

		System.out.println(names.length);//row
		System.out.println(names[0].length);//colum

		for (int i = 0; i <= names.length -1; i++) {
			for (int j = 0; j <= names[i].length-1; j++) {
               System.out.println(names[i][j]+ " ,");
			}
			System.out.println();
		}
		for(java.lang.String i[]:names) {
			for(java.lang.String  j:i) {
				System.out.println(j+" ");
			}
	}      

}
}