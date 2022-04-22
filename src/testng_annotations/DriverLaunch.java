package testng_annotations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverLaunch {
	
	WebDriver driver;
	@BeforeSuite
	public void Driver()
	{
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@AfterSuite
	public void Quite()
	{
	   driver.quit();
	}

	@BeforeTest
	public void waits()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}
	@BeforeClass
	public void login()
	{
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();	
	}
	
	@Test
	public void admin()
	{
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
      List<WebElement> checkbox = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelec')]"));
      
      for (int i=1; i<=checkbox.size(); i++)
      {
    	  
          if (i%2==0)
          {
        	 checkbox.get(i).click(); 
          }
      
      }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
