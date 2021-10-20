package ses1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ghoshit Kashyap\\eclipse-workspace\\ses1\\driver\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.tothenew.com/" );
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//WebElement String=driver.findElement(By.tagName("input"));
			//String.sendKeys("TO THE NEW");
			List<WebElement> contactUs=driver.findElements(By.id("h-contact-us"));
	        Actions actions=new Actions(driver);
	        actions.moveToElement(contactUs.get(1));
	        contactUs.get(1).sendKeys(Keys.ENTER);
	        String Tittle = driver.getTitle();
			System.out.println("Tittle of Page is "+Tittle);
			
			String urlName = driver.getCurrentUrl();
			System.out.println("URL of Page is "+urlName);
			
			
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
			// Close browser
					driver.close();


			

	}
	}
}

