package listners_in_testng;


import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCasesListnersPractice3 {
	
	@Test
	public void tc1()
	{
		System.out.println("line 1");
		System.out.println("line 2");
		
		int i=15;
		int j= 20;
		boolean value=i>j;
	     Assert.assertTrue(value);
	     System.out.println("line 3");
	}
	
	@Test
	public void tc2()
	{
		System.out.println("line 1");
		System.out.println("line 2");
		System.out.println("line 3");
	}
	
	@Test(dependsOnMethods = "tc1")
	public void tc3 ()
	{
	System.out.println("line 1");	
	System.out.println("line 2");
	System.out.println("line 3");
	}

}
