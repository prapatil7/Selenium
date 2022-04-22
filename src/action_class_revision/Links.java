package action_class_revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	
	 public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		driver.get("https://www.amazon.in/");
		
		Dimension d=new Dimension(500, 300);
		driver.manage().window().setSize(d);
		
		Point p=new Point(120, 50);
		driver.manage().window().setPosition(p);
//		 List<WebElement> links = driver.findElements(By.tagName("a"));
//		  for (WebElement w : links)
//		  {
//			  String s=w.getAttribute("href");
//			  System.out.println(s);
//		  }
//		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
