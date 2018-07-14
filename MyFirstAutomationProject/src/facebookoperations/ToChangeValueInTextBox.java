package facebookoperations;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToChangeValueInTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Rohith/Testing/demotwo.html");
		WebElement loginbtn = driver.findElement(By.id("comments"));
		loginbtn.clear();
		loginbtn.sendKeys("Cleared and Welcome to You Buddy ");

		Thread.sleep(500);
		
		driver.close();
	}

}
