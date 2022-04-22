package action_class_revision;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeyboardActions {

	WebDriver driver;
	Actions act;
	@BeforeSuite
	public void driverLaunch()
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	   driver.get("http://demo.automationtesting.in/Register.html");   
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
	
	@Test (priority = 1)
	public void register()
	{
		act=new Actions(driver);
	  WebElement fname=driver.findElement(By.xpath("(//*[@type='text'])[1]"));
	 act.sendKeys(fname, "Daniel").build().perform();
	 act.sendKeys(Keys.TAB).sendKeys("Lucii").build().perform();
	 act.sendKeys(Keys.TAB).sendKeys("California, Lane no 35c, DC road, midtown California").build().perform();
//	 act.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).keyDown(Keys.CONTROL).sendKeys("a")
//	 .sendKeys("c").keyUp(Keys.CONTROL).sendKeys(Keys.TAB).sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v")
//	 .keyUp(Keys.CONTROL).build().perform();
	 act.sendKeys(Keys.TAB).sendKeys("danielluci145@gmail.com").build().perform();
	act.sendKeys(Keys.TAB).sendKeys("9988554422").build().perform();
	WebElement radiobtn =driver.findElement(By.xpath("(//*[@name='radiooptions'])[1]"));
	act.moveToElement(radiobtn).click(radiobtn).build().perform();
	}
	
	@Test(priority = 2)
	public void dropDown()
	{
		WebElement skills = driver.findElement(By.xpath("//*[@id='Skills']"));
		Select sel=new Select(skills);
         List<WebElement> alloptions = sel.getOptions();
          for (WebElement alloption : alloptions)
          {
        	  String p = alloption.getText();
        	  Reporter.log(p, true);
        	sel.selectByVisibleText("Java");  
          }
	}
	
//	@Test(priority = 3)
//	public void countryDropdown()
//	{
//		Actions act1=new Actions(driver);
//		WebElement country_dd = driver.findElement(By.xpath("//*[@id='select2-country-container']"));
//		country_dd.click();
//	   WebElement search_bar= driver.findElement(By.xpath("//*[@class='select2-search__field']"));
//	   act1.sendKeys(country_dd, "India").sendKeys(Keys.ENTER).build().perform();
//	   
//	}
	
//	@Test(priority = 4)
//	public void dateOfBirth_dd()
//	{
//		WebElement day = driver.findElement(By.xpath("//*[@id='yearbox']"));
//		Select sel=new Select(day);
//		sel.selectByIndex(3);
//		
//		WebElement month = driver.findElement(By.xpath("(//*[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched'])[2]"));
//		Select sel1=new Select(month);
//		sel.selectByVisibleText("April");
//		
//		WebElement year = driver.findElement(By.xpath("//*[@id='daybox']"));
//	     Select sel2=new Select(year);
//	     sel2.selectByVisibleText("2022");	
//	}
	
	@Test(priority = 5)
	public void password() throws AWTException
	{
		WebElement password= driver.findElement(By.xpath("(//*[@type='password'])[1]"));
		act=new Actions(driver);
         act.contextClick(password);
         
         Robot robo=new Robot();
         robo.keyPress(KeyEvent.VK_DOWN);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
