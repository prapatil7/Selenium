package testng_annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameters1 {

	WebDriver driver;
	@Parameters("url")
	@Test
	public void launchUrl(String url)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		
		
	}
	
//	@Parameters({"environment", "version"})
//	@Test
//	public void buildInfo(String env, String version)
//	{
//		System.out.println("Environment used is "+env);
//		
//		System.out.println("Build version is "+version);
//		
//	}


}
