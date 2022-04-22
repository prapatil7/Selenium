package assrtion_in_testng;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssignmentScreenshot {
	
	WebDriver driver;
	
	@BeforeSuite
	public void driverLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@AfterSuite
	public void endSuit()
	{
	   driver.quit();
	}
	
	@BeforeClass
	public void screenShot(String name) throws IOException
	{
	    TakesScreenshot ss =(TakesScreenshot)driver;
	     File source = ss.getScreenshotAs(OutputType.FILE);
	    String path =  System.getProperty("user.dir")+"\\screenshot1" + name+".png";
	    File destination = new File(name);
	    org.openqa.selenium.io.FileHandler.copy(source, destination);  
	}
	
	@Test
	public void orangeHrm() throws IOException
	{
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admine");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		String actualresult = driver.findElement(By.xpath("//*[text()='Invalid credentials']")).getText();
		String expectedresult = "Invalid credentials";
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualresult, expectedresult);
		System.out.println("Text message comparision done");
		sa.assertAll();
		
		screenShot("orangehrm ss");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
