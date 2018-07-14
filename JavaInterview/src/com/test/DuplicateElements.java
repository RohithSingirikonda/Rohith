package com.test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String names[] = {"Java", "C", "php", "Java","php"};
		
		//1. using for Loop
		System.out.println("**************************Using For Loops**************");
		for (int i = 0; i < names.length; i++) {
			
			for (int j = i+1; j < names.length; j++) {
				
				if (names[i].equals(names[j])) {
					
					System.out.println("Duplicate Element is :: "+names[i]);
					
				}
				
			}
			
		}
		System.out.println("\n**************************Using HashSet**************");
		
		
		//2. using HashSet: Java collections Store Unique values
		
		Set<String> store = new HashSet<String>();
		for(String name : names ){
			if (store.add(name) == false) {
				System.out.println("Duplicate Element is :: " + name);
			}
		}
		
		
		
		//Using HashMap
		//System.out.println("**************************Using HashMap**************");
		//Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		
		
		
		

	}

}
