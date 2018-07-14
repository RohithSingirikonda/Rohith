package com.testNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class MultipleMethods {

	@Test (priority = 3)
	public void testA(){
		Assert.assertEquals("Gmail", "Gmail");
	}
	
	@Test (priority = 1/*, enabled = false*/)
	public void testC(){
		Assert.assertEquals("Google", "Google");
		
	}
	
	@Test (priority = 2)
	public void testB(){
		Assert.assertEquals("Yahoo", "Yahoo");
	}
	
}
