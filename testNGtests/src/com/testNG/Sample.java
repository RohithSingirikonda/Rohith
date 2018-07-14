package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
		
		@Test
		public void verifyTitle(){
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.gmail.com");
		String PageTitle = driver.getTitle();
		
		Assert.assertEquals(PageTitle,"Gmail"); 
		
		driver.close();
		
		}
		
	
	}