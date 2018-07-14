package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleMethods_Depends_on_Methods {

	@Test ()
	public void login(){
		System.out.println("\nLogin Successfull");
	}
	
	@Test (dependsOnMethods = {"login"})
	public void Search(){
		System.out.println("search Successfull");
		
	}
	
	@Test (dependsOnMethods = {"Search"})   //Hard Dependency  @Test (dependsOnMethods = {"Search"})
	public void AdvancedSearch(){
		
		Assert.assertEquals("Google", "google");
		//System.out.println("Advanced search Successfull");
	}
	
	@Test (dependsOnMethods = {"AdvancedSearch"})
	public void Logout(){
		System.out.println("Logout Successfull\n");
	}
	
}
