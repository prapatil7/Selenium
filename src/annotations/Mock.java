package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mock {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        options.addArguments("-disable-notifications");
        options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);

		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("(//*[@class='analystic'])[2]")).click();
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(frame1);
	
		WebElement frame2 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("Selenium");
		
	}

}
