package overAll;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingButtonTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/Rohith/Testing/demotwo.html");
		String xp = "//button[text() = 'Hit Me!']";
		
		WebElement btn = driver.findElement(By.xpath(xp));
		btn.sendKeys(Keys.ENTER);
		System.out.println("Hitted Me Successfully...");
		
		driver.close();

	}

}
