package com.test;

import org.testng.annotations.Test;

public class TestC {
  
	@Test (groups = {"sanity","regression"}, priority = 1)
	public void login() {
		System.out.println("Login Successfull");
	}
	
	
	@Test (groups = {"sanity"}, priority = 2)
	public void Search(){
		System.out.println("search Successfull");
		
	}
	
	@Test (groups = {"sanity"}, priority = 3)
	public void FundTransfer(){
		System.out.println("FundTransfer Successfull");
		
	}
	
	@Test (groups = {"regression"}, priority = 4)   
	public void AdvancedSearch(){
		System.out.println("Advanced search Successfull");
	}
	
	@Test (groups = {"regression"}, priority = 5)   
	public void BillPayment(){
		System.out.println("Bill Payment Successfull");
	}
	
	
	@Test (groups = {"sanity","regression"}, priority = 6)
	public void logout(){
		
		System.out.println("Logout Successfull");
	}
	
}
