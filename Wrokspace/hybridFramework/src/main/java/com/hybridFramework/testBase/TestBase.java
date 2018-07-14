package com.hybridFramework.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	WebDriver driver; 
	
	public void getBrowser(String browser)
	{
		if (System.getProperty("os.name").contains("window")) {
			//Prints the OS Name
			System.out.println(System.getProperty("os.name")); 
			
			if (browser.equalsIgnoreCase("chrome")) {
			
				//Prints the User Directory Name
				System.out.println(System.getProperty("user.dir")); 
				
				System.setProperty("webdriver.chrome.driver", System.getProperty(("user.dir"), "/drivers/chromedriver.exe"));
				driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("firefox") ) {
				System.setProperty("webdriver.gecko.driver", System.getProperty(("user.dir"),"/drivers/geckodriver.exe"));
			}
		}
		else if (System.getProperty("os.name").contains("mac")) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty(("user.dir"), "/drivers/chromedriver"));
				driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty(("user.dir"), "/drivers/geckodriver"));
				driver = new FirefoxDriver();

			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestBase test = new TestBase();
		test.getBrowser("chrome");
	}

}
