package com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWeb {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		//*[@id="content"]/table/tbody/tr[1]/th 
		//*[@id="content"]/table/tbody/tr[2]/th
		//*[@id="content"]/table/tbody/tr[4]/th
		//*[@id="content"]/table/tbody/tr[1]/td[6]
		//*[@id="content"]/table/tbody/tr[2]/td[6]
		
		
		
		//Method 1
		String beforexpath ="//*[@id='content']/table/tbody/tr[";
		String afterxpath ="]/th";
		
		for (int i = 1; i <=4; i++) {
		
			String name = driver.findElement(By.xpath(beforexpath + i + afterxpath)).getText();
			System.out.println(name);
			
			if (name.contains("Taipei 101")) {
				driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[" + i + "]/td[6]")).click();
				System.out.println(name+" details Clicked Successfully");
				break;
				
			}
		}
		
		

		//Method 2
		driver.findElement(By.xpath("//td[text()='3']//following-sibling::td//a[text()='details']")).click();
		
		
		
		
		
		
		
		

	}

}


