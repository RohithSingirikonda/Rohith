package facebookoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindRadioButtonisEnabledorNot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement mradbtn = driver.findElement(By.id("u_0_b"));
		WebElement fradbtn = driver.findElement(By.id("u_0_a"));
		Thread.sleep(5000);
		
		if (mradbtn.isSelected()) {
			
			System.out.println("Male Radio Button is selected");
		}
		else if (fradbtn.isSelected()) {
			System.out.println("Female Radio Button is Selected");
		}
		else {
			System.out.println("None of the option is selected");
		}
		
		driver.close();
	}

}
