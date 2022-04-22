package policybazar_insdomain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
    WebDriver driver;
	@BeforeSuite
	public void driverLaunching()
	{
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
	       driver=new ChromeDriver();
		
	}

	@BeforeClass
	public void urlLaunch()
	{
       driver.get("https://www.policybazaar.com");
	}
	

	
}
