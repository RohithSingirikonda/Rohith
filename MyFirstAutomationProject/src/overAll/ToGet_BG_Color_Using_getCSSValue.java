package overAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGet_BG_Color_Using_getCSSValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/Rohith/Testing/demotwo.html");
		WebElement color = driver.findElement(By.id("comments_two"));
		System.out.println(color.getCssValue("color"));
		System.out.println(color.getCssValue("background-color"));
		
		driver.close();

	}

}
