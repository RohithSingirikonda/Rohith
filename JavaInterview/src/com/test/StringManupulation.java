package com.test;

public class StringManupulation {

	public static void main(String[] args) {

		String s1 = "Welcome to Java Selenium with Java";
		String s2 = "  Welcome to Java Selenium  ";
		String s3 = "Welcome to Java Selenium with java";
		
		
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.indexOf('a'));  					// First occurrence of same element
		
		System.out.println(s1.indexOf('a',13));  				// Second occurrence of same element STATIC
		
		System.out.println(s1.indexOf('a',s1.indexOf('a')+1)); 	// Second occurrence of same element DYNAMIC
		
		System.out.println(s1.indexOf('a',s1.indexOf('a')+3)); 	// Third occurrence of same element DYNAMIC
		
		System.out.println(s1.substring(11, 15));
		
		
		//String Comparison
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s3));
		
		//Sub String
		System.out.println(s1.substring(11, 15));
		
		
		//Trim
		System.out.println(s2.trim());
		
		//Replace the Elemenst
		String s4 = s2.trim(); 
		System.out.println(s4.replace(" ", "->"));
		
		String date = "01-01-2018";
		System.out.println("Replace Method:: "+date.replace("-", "/"));
		
		
		//Split
		String testVal[] = s2.split(" ");
		for (int i = 0; i < testVal.length; i++) {
			System.out.println(testVal[i]);
		}
				
		
		System.out.println("\nConcatination:: "+s1.concat(s2));
		
	}

}
