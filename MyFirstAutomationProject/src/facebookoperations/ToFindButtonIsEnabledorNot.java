package facebookoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindButtonIsEnabledorNot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement btn = driver.findElement(By.id("loginbutton"));
		
		if (btn.isEnabled()) {
			
			System.out.println("Login Button is Enabled");
		}
		else {
			
			System.out.println("Login Button is Disabled");
		}

		
		Thread.sleep(5000);
		System.out.println("Other Test Starting....");
		
		driver.get("file:///D:/Rohith/Testing/demotwo.html");
		WebElement lbtn = driver.findElement(By.id("submit"));
		
		if (lbtn.isEnabled()) {
			
			System.out.println("Login Button is Enabled");
		}
		else {
			
			System.out.println("Login Button is Disabled");
		}

		Thread.sleep(5000);
		
		driver.close();
		
	}

}
