package annotations;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(priority = 1, groups = "Sanity")
	public void login()
	{
		System.out.println("Login to the application");
		
	}
	
	@Test(priority = 2, groups = {"Functional", "Sanity"}, description = "dashboard test cases ")
	public void dashBoard()
	{
		System.out.println("Dashboard");
	}

	@Test(priority = 3, groups = "Regression")
	public void profile()
	{
		System.out.println("Profile");
	}
	
	@Test(priority = 4)
	public void logout()	
	{
		System.out.println("Logout test case");
	}
	


}
