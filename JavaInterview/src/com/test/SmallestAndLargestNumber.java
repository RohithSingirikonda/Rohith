package com.test;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		
		int num[] = {-55, 0, 10, 5000};
		int largest = num[0];
		int smallest = num[0];
		
		for (int i = 1; i < num.length; i++) {
			if (num[i]>largest) {
				largest  = num[i];
			}
			else if (num[i]<smallest) {
				smallest = num[i];
			}
		}
		
		System.out.println("\nGiven Array is :: " + Arrays.toString(num));
		System.out.println("smallest Number is :: " + smallest);
		System.out.println("Largest Number is :: " + largest);
	}

}
