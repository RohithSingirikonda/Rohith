package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators_A {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			WebDriver driver  = new ChromeDriver(); 
			
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			driver.findElement(By.linkText("Create a new account")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@name='name786f3950']")).sendKeys("Rohith");
			driver.findElement(By.xpath("//input[@name='login786f3950']")).sendKeys("rohithraju");
			driver.findElement(By.xpath("//input[@name='btnchkavail786f3950']")).click();;
			driver.findElement(By.name("passwd786f3950")).sendKeys("test@123");
			driver.findElement(By.name("confirm_passwd786f3950")).sendKeys("test@123");
			driver.findElement(By.name("altemail786f3950")).sendKeys("singirikonda.rohith@gmail.com");
			driver.findElement(By.xpath("//input[@id='Register']")).click();
			
			//String fName = driver.findElement(By.tagName("input")).getText();
			//String[] parts = fName.split("");
			//driver.findElement(By.xpath("//input[@name='name786f3950']")).sendKeys("Rohith");
			

	}

}
