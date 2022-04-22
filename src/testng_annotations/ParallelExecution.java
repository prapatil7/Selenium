package testng_annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	WebDriver driver;
	
	@Parameters("url1")
	@Test
	public void launchUrl(String url1)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
         driver=new ChromeDriver();
        driver.get(url1);
	}
	
	@Parameters("url2")
	@Test
	public void url2(String url2)
	{
		driver.get(url2);
	}

}
