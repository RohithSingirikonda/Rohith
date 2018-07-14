package com.testNG;

import org.testng.annotations.Test;

public class MultipleMethodsPrioirity {

	
	@Test (priority = 1)
	public void login(){
		System.out.println("\nLogin Successfull");
	}
	
	@Test (priority = 2)
	public void Search(){
		System.out.println("search Successfull");
		
	}
	
	@Test (priority = 3, enabled=false) //Its skips the Execution
	public void AdvancedSearch(){
		System.out.println("Advanced search Successfull");
	}
	
	@Test (priority = 4)
	public void Logout(){
		System.out.println("Logout Successfull\n");
	}
	
	
}
