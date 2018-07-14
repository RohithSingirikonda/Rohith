package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearch_ByTagid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:/Softwares/Extracted Files/chromedriver_win32 new/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		Thread.sleep(555);
		driver.findElement(By.id("lst-ib")).sendKeys("Rohith Kumar Singirikonda");
		Thread.sleep(5555);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(555);
		
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(555);
		
		//driver.findElement(By.className("c1")).click();
		//driver.findElement(By.linkText("actitime")).click();
		//driver.findElement(By.partialLinkText("acti")).click();
		
		Thread.sleep(555);
		driver.close();
		
	}

}
