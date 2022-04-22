package test_ng_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeClass1 {
	WebDriver driver;
	@BeforeSuite
	public void driverLaunching()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.gloqr.com/");
		 
	}
	
	@BeforeTest
	public void waits()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
	}
	
	@Test
	public void getLinks()
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));
	     int total_number_of_links = links.size();

		for (WebElement links1 : links)
	   {
		     String s=links1.getAttribute("href");
		     
		     System.out.println(s);
		     
	   }
	     System.out.println(total_number_of_links);

	}
	
	
	
}
