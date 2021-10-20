package ses1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_browser_test {

	public static void main(String[] args) 
{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ghoshit Kashyap\\eclipse-workspace\\ses1\\driver\\geckodriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://meet.google.com/" );
}

}
