package com.test;

public class Remove_JunkValues {

	public static void main(String[] args) {
		
		String s = "%$#&**%%#HELLO)((&$#oooooWorld&((((&&&";
		String s1 = "Welcome@$%&*@&**&to&^%Selenium";
		
		
		//[^a-zA-Z0-9] --- Regular Expression
		
		s = s.replaceAll("[^a-zA-Z0-9]", "_");
		System.out.println(s);
		
		
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "_");
		System.out.println(s1);

	}

}
