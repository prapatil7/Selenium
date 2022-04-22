package action_class_revision;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mock10April {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
	   driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		WebElement upload = driver.findElement(By.xpath("//*[@name='upload']"));
		
	upload.sendKeys("C:\\Users\\user\\Desktop\\4k-wallpaper-afterglow-blur-1236701.jpg");	
	}
}
