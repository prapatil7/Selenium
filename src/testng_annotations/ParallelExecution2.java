package testng_annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution2 {
	
	WebDriver driver;
	
	@Test
	public void url1()
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://groww.in/");
	}
	
	@Test
	public void url2()
	{
		driver.get("https://jsonpathfinder.com/");
	}
	

}
