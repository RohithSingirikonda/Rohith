package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlignHorizontallyGmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebElement email = driver.findElement(By.id("identifierId"));
		Point p1 = email.getLocation();
		int x1 = p1.getX();
		System.out.println("X value of email field: "+x1);
		
		WebElement next = driver.findElement(By.id("identifierNext"));
		Point p2=next.getLocation();
		int x2=p2.getX();
		System.out.println("X value of Next button : "+x2);
		
		if (x2-x1<=0)
		{
			System.out.println("Email textbox and next button aligned horizontally");
		}
		else {
			System.out.println("Email textbox and next button is Not aligned horizontally");
		}
		
		Thread.sleep(500);
		
		
		WebElement email1 = driver.findElement(By.id("identifierId"));
		Point p11 = email1.getLocation();
		int x11 = p11.getY();
		System.out.println("Y value of email field: "+x11);
		
		WebElement next1 = driver.findElement(By.id("identifierNext"));
		Point p21=next1.getLocation();
		int x21=p21.getY();
		System.out.println("Y value of Next button : "+x21);
		
		if (x21-x11<=0)
		{
			System.out.println("Email textbox and next button aligned Vertically");
		}
		else {
			System.out.println("Email textbox and next button is Not aligned Vertically");
		}
		
		
		
		
		
		
		
	}
}
