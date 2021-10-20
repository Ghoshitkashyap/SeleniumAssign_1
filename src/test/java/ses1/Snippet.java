package ses1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snippet {
	public static void main(String[] args) {
	
	
	String currentDir = System.getProperty("user.dir");
	// System Property for Chrome Driver   
    System.setProperty("webdriver.chrome.driver", currentDir+"\\driver\\chromedriver\\chromedriver.exe");  
    
	// Initialize browser
	WebDriver driver=new ChromeDriver();
	 
	// Open Google
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
	
	//Register new email
	String email = RandomStringFactory.usingUUID()+"@gmail.com"; 
	driver.findElement(By.id("email_create")).sendKeys(email);
	driver.findElement(By.id("SubmitCreate")).click();
	
	// wait till the Registration page is not opend
	 WebDriverWait wait = new WebDriverWait(driver, 15);      	
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Your personal information']")));
	 
	 //enter first name in to the Registration page
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
	 driver.findElement(By.name("customer_firstname")).sendKeys("FirstName");
	 
	 //enter last name in to the Registration page
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
	 driver.findElement(By.name("customer_lastname")).sendKeys("LastName");
	 
	 //enter email in to the Registration page
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
	 driver.findElement(By.name("email")).clear();
	 driver.findElement(By.name("email")).sendKeys("email12345@gmail.com");
	 
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
	// Close browser
		driver.close();
	 
}


}
