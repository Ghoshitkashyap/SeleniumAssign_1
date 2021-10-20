package ses1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome_browser {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ghoshit Kashyap\\eclipse-workspace\\ses1\\driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/" );
		WebElement String=driver.findElement(By.tagName("input"));
		String.sendKeys("TO THE NEW");
		
	}

}
