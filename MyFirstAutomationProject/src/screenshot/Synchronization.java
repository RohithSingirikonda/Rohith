package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:/Softwares/Extracted Files/chromedriver_win32 new/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		Thread.sleep(300);
		driver.findElement(By.id("email")).sendKeys("rohith555raju@gmail.com");
		Thread.sleep(300);
		driver.findElement(By.id("pass")).sendKeys("Vinnu$143");
		Thread.sleep(300);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(300);
		try
		{
			Thread.sleep(20000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
			driver.findElement(By.id("logoutLink")).click();
			driver.close();
		
	
		//driver.findElement(By.id("u_a_9")).click();
		//Thread.sleep(3000);
		
		//driver.close();
	}

}
