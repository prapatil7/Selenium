package listners_in_testng;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshot;

public class ListnersClassExapmle3 extends TestClassListnersExample3  implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("tests started: "+ result.getMethod());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("tests succed: "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			Screenshot.takeScreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped: "+ result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println("test start: " + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test finished: "+ context.getName());
	}

}
