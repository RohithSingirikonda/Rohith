package facebookoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindLogoisAvailable_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement logo = driver.findElement(By.className("lfloat"));
		
		if (logo.isDisplayed()) {
			
			System.out.println("Logo is Avaialale");
			
		} else {

			System.out.println("Logo is Not Avaialale");
			
		}
		
		driver.close();

	}

}
