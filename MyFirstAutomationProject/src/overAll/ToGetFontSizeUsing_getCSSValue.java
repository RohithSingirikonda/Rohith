package overAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetFontSizeUsing_getCSSValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/Rohith/Testing/demotwo.html");
		WebElement font = driver.findElement(By.id("comments"));
		String s = font.getCssValue("font");
		
		System.out.println("Font size is: "+s);
		driver.close();
		

	}

}
