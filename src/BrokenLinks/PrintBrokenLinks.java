package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintBrokenLinks {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\selenium-java-4.1.2 (1)\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.flipkart.com");
	 
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	      int numberoflinks = links.size();
	      
	      for (int i=0; i<=numberoflinks; i++)
	      {
	    	    WebElement element = links.get(i);
	    	    
	    	    String url = element.getAttribute("href");
	      
	    	    
	
	      try
	      {
	    	  URL link = new URL(url);
	    	  
	    	  HttpURLConnection httpconn =  (HttpURLConnection)link.openConnection();
	    	  
	    	  Thread.sleep(2000);
	    	  
	    	  httpconn.connect();
	    	  
	    	  int rescode = httpconn.getResponseCode();
	    	  
	    	  
	    	  if(rescode>400)
	    	  {
	  			System.out.println(url +"---> broken and response code is "+rescode);

	    	  }
	    	  
	      }
	      
	      catch(Exception e)
	      {
	    	  System.out.println("exception arrived");
	      }
	    	  
	    	  
	      }
	  }
}