package dataproviders;

import org.testng.annotations.Test;

public class DPTest {

	   @Test(dataProvider = "testdata", dataProviderClass = dataproviders.DPClass.class)
	  public void testCase(String s1, String s2)
	  {
		  System.out.println(s1+ " "+s2);
	  }
}
