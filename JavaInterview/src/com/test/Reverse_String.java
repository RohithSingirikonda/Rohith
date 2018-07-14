package com.test;

public class Reverse_String {

	public static void main(String[] args) {
		
		 	String  str = "Hello World";
		 	String reverse = "";
		 	
		 	for (int i = str.length()-1; i>=0; i--) {
				
		 		reverse = reverse+str.charAt(i);
			}
		
		 	System.out.println(reverse);
		 	
		 	//Using Sting Buffer
		 	StringBuffer sf = new StringBuffer(str);
		 	System.out.println("Reverse using Sring buffer:: "+sf.reverse());

	}

}
