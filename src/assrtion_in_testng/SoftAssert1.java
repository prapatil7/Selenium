package assrtion_in_testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
	@Test
	public void tc1()
	{

		System.out.println("first line");
		
		System.out.println("Second line");
		
		int i =10;
		int j= 20;
		boolean value = i>j;
	
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(value);
		
		System.out.println("third line");
		
		sa.assertAll();
		  
	}

}
