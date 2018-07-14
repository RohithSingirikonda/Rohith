package locators;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
    public static void main(String[] args) throws InterruptedException {  
    	System.setProperty("webdriver.chrome.driver","C:/Softwares/Extracted Files/chromedriver_win32 new/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
            String url = "https://accounts.google.com/signin";
            driver.get(url);
            driver.findElement(By.id("identifierId")).sendKeys("rohith555raju@gmail.com"); 
            //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      
            //WebDriverWait wait=new WebDriverWait(driver, 20);               
            //driver.findElement(By.xpath("//input[@type='email']")).click();     
            driver.findElement(By.xpath("//span[text()='Next']")).click(); 
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test"); 
            driver.findElement(By.xpath("//span[text()='Next']")).click();
    }  
}