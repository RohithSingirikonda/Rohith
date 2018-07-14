package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip_Selection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("http://www.makemytrip.com/flights");
		WebElement textbox=driver.findElement(By.id("hp-widget__sfrom"));
		textbox.clear();
		textbox.sendKeys("Banga");
		Thread.sleep(2000);
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='autocomplete_from']")	);
		int count=allOptions.size();
		System.out.println("No. of autosuggestions: "+count); 
		System.out.println("Listof autosuggstions"); 
		for(int i=0;i<count;i++)
		{
		String text=allOptions.get(i).getText();
		System.out.println(text);
		}
		textbox.sendKeys(Keys.ARROW_DOWN);
		textbox.sendKeys(Keys.ARROW_DOWN);
		textbox.sendKeys(Keys.ENTER);
		
	}

}
