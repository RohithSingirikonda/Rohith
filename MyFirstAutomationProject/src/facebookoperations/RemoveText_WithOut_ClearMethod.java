package facebookoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveText_WithOut_ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/Rohith/Testing/demotwo.html");
		WebElement tb = driver.findElement(By.id("comments"));

		Thread.sleep(1000);
		
		tb.sendKeys(Keys.CONTROL+"a");
		tb.sendKeys(Keys.DELETE);

		Thread.sleep(1000);
		driver.close();
	}

}
