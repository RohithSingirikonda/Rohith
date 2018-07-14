package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestB {
	
	/*@BeforeClass
	public void login() {
		System.out.println("Login Successfull");
	}
	
	@AfterClass 
	public void logout(){
		
		System.out.println("Logout Successfull");
	}*/
	
	
	@Test (priority = 1)
	public void deleteVendor(){
		System.out.println("Vendor Deleted Successfully");
	}
	
	@Test (priority = 2)
	public void deleteProduct(){
		System.out.println("Product Deleted Successfully");
	}
	
	@Test (priority = 3)
	public void deleteCurrency(){
		System.out.println("Currency Deleted Successfully");
	}

}
