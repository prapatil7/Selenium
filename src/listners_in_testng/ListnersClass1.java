package listners_in_testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersClass1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test casesb started: "+ result.getMethod());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test cases succeed: "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test cases failed: "+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test cases skipped: "+ result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("test started: "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
	System.out.println("Tests Completed: "+ context.getName());
	}
	
}
