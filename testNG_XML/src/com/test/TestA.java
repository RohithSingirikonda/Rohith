package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestA {
  
	@BeforeTest
	public void login() {
		System.out.println("Login Successfull");
	}
	
	@AfterTest
	public void logout(){
		
		System.out.println("Logout Successfull");
	}
	
	
	@Test (priority = 1)
	public void addVendor(){
		System.out.println("Vendor Added Successfully");
	}
	
	@Test (priority = 2)
	public void addProduct(){
		System.out.println("Product Added Successfully");
	}
	
	@Test (priority = 3)
	public void addCurrency(){
		System.out.println("Currency Added Successfully");
	}
	
	
	
}
