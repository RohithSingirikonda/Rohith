package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://rohith-trials641.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("oI3M@wa4TM");
		driver.findElement(By.id("btnLogin")).click();
		
		////span[text()='Admin']/following-sibling::span[@class='material-icons collapsible-indicator']
		driver.findElement(By.xpath("//span[text()='Admin']/following-sibling::span[@class='material-icons collapsible-indicator']")).click();
		driver.findElement(By.xpath("//li[@id='menu_admin_UserManagement']")).click();
		
		
		String error = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		System.out.println(error);
		
	}

}
