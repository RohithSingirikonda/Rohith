package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplePopupHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]")).click();
		
		
		String parent_window =driver.getWindowHandle();
		
		Set<String> s1=driver.getWindowHandles(); 
		Iterator<String> it= s1.iterator();
		 
		while(it.hasNext())
		{
		 String child_window=it.next();  
		 	if(!parent_window.equals(child_window))
		 	{
			
		 		driver.switchTo().window(child_window);
		 		String  url = driver.getCurrentUrl();
				
			if (!url.contains("test")) {
				break;
			}else {
				System.out.println("Url does not contains given 'Test' Url is :: "+url);
			}
		}
		 
		}
		
		driver.switchTo().window(parent_window);
		
		

	}

}
