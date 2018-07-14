package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingMultiplepoups {

	public WebDriver driver;

	@Test
	public void Testclass(){

		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]")).click();		
	
		String parent = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			
			String child = driver.getWindowHandle();
			
			if(!parent.equals(child)){
				
				driver.switchTo().window(child);
				String url = driver.getCurrentUrl();
				
				if (url.contains("aatest")) {
					driver.close();
					driver.switchTo().window(parent);
				}else {
					driver.quit();
				}
			}
			
			driver.switchTo().window(parent);
			
		}
	}
	
	
}
