package facebookoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveText_Using_Backspace {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/Rohith/Testing/demotwo.html");
		WebElement tb = driver.findElement(By.id("comments"));
		String s = tb.getAttribute("value");
		int count = s.length();
		for (int i = 0; i < count; i++) {
			
			Thread.sleep(200);
			tb.sendKeys(Keys.BACK_SPACE);
		}
		
		driver.close();
		

	}

}
