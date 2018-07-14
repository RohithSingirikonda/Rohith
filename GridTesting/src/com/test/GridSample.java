package com.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridSample {
	
	
	@Test
	public void testLogin() throws MalformedURLException{
		
		new DesiredCapabilities();
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wb/hub"),cap);
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rohithraju@gmail.com");;
		driver.findElement(By.xpath("//input[type='password']")).sendKeys("Test@123");
		
		
	}

}
