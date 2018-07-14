package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlignFacebookLogins {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https:www.facebook.com");
		WebElement email = driver.findElement(By.id("email"));
		Point p1 = email.getLocation();
		int x1 = p1.getX();
		System.out.println("X value of email field: "+x1);
		
		WebElement next = driver.findElement(By.id("pass"));
		Point p2=next.getLocation();
		int x2=p2.getX();
		System.out.println("X value of Next button : "+x2);
		
		if (x2-x1<=0)
		{
			System.out.println("Email textbox and password textbox aligned horizontally");
		}
		else {
			System.out.println("Email textbox and password textbox is Not aligned horizontally");
		}
		
		Thread.sleep(500);
		
		
		WebElement email1 = driver.findElement(By.id("email"));
		Point p11 = email1.getLocation();
		int x11 = p11.getY();
		System.out.println("Y value of email field: "+x11);
		
		WebElement next1 = driver.findElement(By.id("pass"));
		Point p21=next1.getLocation();
		int x21=p21.getY();
		System.out.println("Y value of Next button : "+x21);
		
		if (x21-x11<=0)
		{
			System.out.println("Email textbox and password textbox aligned Vertically");
		}
		else {
			System.out.println("Email textbox and password textbox is Not aligned Vertically");
		}
		
		driver.close();
		
		
		
	}
}
