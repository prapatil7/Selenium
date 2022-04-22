package parallel_executions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParellelExcecutionTestLevel { 
@Parameters("url")
@Test
public void gtUrl(String url)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
     driver.get(url);
}

@Parameters("url1")
@Test
public void getUrl2(String url1)
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
     driver.get(url1);
}
}
