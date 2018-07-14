package com.test;

public class Find_Missing_No_in_Array {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,5,6,7,8,9,10};
		int sum = 0;
		int sum1 = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum = sum+a[i];
		}
		
		System.out.println(sum);
		
		
		for (int j = 0; j <=10; j++) {
			sum1 =  sum1 + j;
		}
		
		System.out.println("Missing Element is :: "+ (sum1-sum));
		
		
	}

}
