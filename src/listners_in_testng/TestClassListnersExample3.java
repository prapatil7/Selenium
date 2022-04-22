package listners_in_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestClassListnersExample3 {
	static WebDriver driver;
	@BeforeSuite
	public void driverLaunching()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com");
	}
//	@AfterSuite
//	public void endSuit()
//	{
//		driver.quit();
//	}
		
	@BeforeTest
	public void waits()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void loginPage()
	{
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admine");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click(); 
		String actual_result  = driver.findElement(By.xpath("//*[text()='Invalid credentials']")).getText();
		String expected_result = "invalid credeintial";
        Assert.assertEquals(expected_result, actual_result);
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}