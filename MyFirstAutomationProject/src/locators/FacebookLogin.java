package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

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

	//	driver.findElement(By.id("logoutMenu")).click();
	//	Thread.sleep(300);
		
		
		WebElement navigationclick = driver.findElement(By.id("logoutMenu"));
	    WebElement logout = driver.findElement(By.xpath("//div[@id='u_d_1']/div/div/div/div/div/ul/li[12]/a/span/span"));
	    navigationclick.click();
	    if(logout.isEnabled() && logout.isDisplayed()) {
	        logout.click();
	    }
	    else {
	        System.out.println("Element not found");
	    }
	    
	}

}
