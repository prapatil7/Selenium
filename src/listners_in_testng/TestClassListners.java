package listners_in_testng;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestClassListners {

	WebDriver driver;
      @Test
      public void tc1()
      {
    	  System.out.println("line 1");
    	  System.out.println("lime 2");
    	  int a=10;
    	  int b=20;
    	   boolean value = a>b;
    	   Assert.assertTrue(value);
    	   System.out.println("line 3");
    	  
      }
      
      @Test
      public void tc2()
      {
    	  System.out.println("line 1");
    	  System.out.println("line 2");
      }
	
      @Test(dependsOnMethods = "tc1")
      public void tc3()
      {
    	  System.out.println("line 1");
    	  
    	  System.out.println("line 2");
      }
      

}
