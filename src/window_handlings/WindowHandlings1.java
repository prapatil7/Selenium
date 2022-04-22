package window_handlings;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandlings1 {
	WebDriver driver;
	@BeforeSuite
	public void driverLaunch()
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	   driver.get("http://demo.automationtesting.in/Windows.html");   
	}
	
	@AfterSuite
	public void endSuit()
	{
	driver.quit();
	}
	
	@BeforeTest
	public void waitsGiven() 
	{
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(enabled = false)
	public void newWindow()
	{
     	WebElement clickonbutton = driver.findElement(By.xpath("(//*[@class='btn btn-info'])[1]"));
		clickonbutton.click();
		clickonbutton.click();
		clickonbutton.click();

		String parentwid = driver.getWindowHandle();
		System.out.println(parentwid);
		
	     Set<String> childwid = driver.getWindowHandles();
	     ArrayList<String> list = new ArrayList<>(childwid);
	     driver.switchTo().window(list.get(1));
	     driver.get("https://www.google.com");
	     driver.switchTo().window(list.get(2));
         driver.findElement(By.xpath("(//*[text()='Downloads'])[1]")).click();
         
	     
//		   for (String wid : childwid)
//		   {
//	           String s= wid;
//	          System.out.println(s);
//			   
//			   if (!(parentwid.equals(childwid))) 
//			  {
//	               driver.switchTo().frame(wid);
//	               driver.get("https://www.google.com");
//			  }
//		   }
	}
	
	
	
//	@Test
//	public void newSeperateWindow()
//	{
//		driver.findElement(By.xpath("(//*[@data-toggle='tab'])[2]")).click();
//		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
//		driver.switchTo().frame(1);
//		driver.findElement(By.xpath("))
//       WebElement searchbar = driver.findElement(By.xpath("//*[@type='search']"));
//        
//		
//	}
//
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
