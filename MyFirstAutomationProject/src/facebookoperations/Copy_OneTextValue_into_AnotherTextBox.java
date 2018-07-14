package facebookoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_OneTextValue_into_AnotherTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Rohith/Testing/demotwo.html");
		WebElement tb = driver.findElement(By.id("comments"));
		tb.sendKeys(Keys.CONTROL+"a");
		tb.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		
		WebElement newtb = driver.findElement(By.id("comments_two"));
		Thread.sleep(1000);
		newtb.clear();
		newtb.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(800);
		newtb.sendKeys("\nSuccesfully Copied and closing the Test...!");
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
