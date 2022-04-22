package excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
 import org.testng.annotations.Test;

import utility.ExcelReadData;

public class ExcelPracticeFacebook {
   WebDriver driver;
  @BeforeSuite
    public void launchDriver()
    {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com");
    }
  
   
    @Test
     public void fbLogin() throws IOException
     {
    	WebElement mail_id=driver.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy']"));
    	mail_id.sendKeys(ExcelReadData.readExcelData(0, 1, 0));
    	
    	driver.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy _9npi']")).sendKeys(ExcelReadData.readExcelData(0, 2, 0));
     }
    
}    