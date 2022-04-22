package action_class_revision;

import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.archivers.sevenz.CLI;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alert {
	
  WebDriver driver;
	@BeforeSuite
	public void driver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Alerts.html");
	}
	
//	@AfterSuite
//	public void end()
//	{
//		driver.quit();
//	}
//	
	@BeforeTest
	public void waits()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void alertHandling()
	{
	driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
	driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
	driver.switchTo().alert().accept();
	}
	
	@Test
	public void alertHandling2()
	{
		driver.findElement(By.xpath("(//*[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();	
	}
	
	@Test
	public void alertHandling3() throws InterruptedException
	{
		driver.findElement(By.xpath("(//*[@class='analystic'])[3]")).click();
		
//		driver.findElement(By.xpath("//*[@class='btn btn-info']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().sendKeys("Pratik");
		driver.findElement(By.xpath("//*[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("shivam komawar");
		Thread.sleep(4000);
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
