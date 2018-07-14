package facebookoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTextBoxEmptyorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("file:///D:/Rohith/Testing/demotwo.html");
		WebElement text = driver.findElement(By.id("comments"));
		String s = text.getAttribute("value");
		
		if(s.length()==0)
		{
			
			System.out.println("Text Box is Empty");
		}
		else {
			System.out.println("There is some text in the box");
		}

		
		driver.close();
	}

}
