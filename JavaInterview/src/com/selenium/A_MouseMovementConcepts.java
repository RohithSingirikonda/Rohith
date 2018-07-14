package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_MouseMovementConcepts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
		
		Actions action = new Actions(driver);
		WebElement login = driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"));
		action.moveToElement(login).build().perform();
		Thread.sleep(3000);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SpiceCash/SpiceClub Members')]"))).build().perform();
		Thread.sleep(3000);
		//action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Member Login')]"))).click().build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
	
		
		//driver.findElement(By.xpath("//a[contains(text(),'SME Traveller')]")).click();
		
	}

}
