package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]")).click();
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowID = it.next();
		
		
		String childWindowID = it.next();
		
		driver.switchTo().window(childWindowID);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.contains("popup")) {
			driver.close();
			driver.switchTo().window(parentWindowID);
		}
		
		String urla = driver.getCurrentUrl();
		System.out.println(urla);
		
		
	}

}
