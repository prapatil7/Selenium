package listners_in_testng;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshot;

public class ListenersClass2Example extends TestClass2ListnersExample implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	  System.out.println("test case started: "+ result.getMethod());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test succeed: "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("tests failed: "+ result.getName());
		
		try {
			Screenshot.takeScreenshot(driver, result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
	  System.out.println("tests skipped: "+ result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("test started: "+ context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("tests finished: "+ context.getName());
	}
	
	

}
