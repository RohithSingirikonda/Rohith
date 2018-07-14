package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowsersTC {
	
	static WebDriver driver;
	
	@Test (priority = 1)
	public void launchBroswer(){
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test (priority = 2)
	public void verifyPageTitleGoogle(){
		driver.get("http://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
	}
	
	@Test (priority = 3)
	public void verifyPageTitleYahoo(){
		driver.navigate().to("http://www.yahoo.com");
		Assert.assertEquals("Yahoo", driver.getTitle());
	}
	
	@Test (priority = 4)
	public void closebrowser(){
		driver.close();
	}


}
