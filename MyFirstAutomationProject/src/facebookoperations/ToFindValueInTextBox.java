package facebookoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindValueInTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		WebElement loginbtn = driver.findElement(By.id("u_0_4"));
		String text = loginbtn.getAttribute("value");
		System.out.println("The Value present in Login Buttion is: "+text);
	}

}
