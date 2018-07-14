package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TackingTheScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(300);
		driver.findElement(By.id("email")).sendKeys("rohith555raju@gmail.com");
		Thread.sleep(300);
		driver.findElement(By.id("pass")).sendKeys("Vinnu$143");
		Thread.sleep(300);
		
		EventFiringWebDriver eventdriver = new EventFiringWebDriver(driver);
		File srcfile = eventdriver.getScreenshotAs(OutputType.FILE);
		File destfile = new File("D:/Rohith/Testing/Facebook.png");
		FileUtils.copyFile(srcfile,destfile);
		
		driver.close();
		

	}

}
