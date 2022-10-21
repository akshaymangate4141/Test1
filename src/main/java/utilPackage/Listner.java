package utilPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testBase.TestBase;

public class Listner extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test execution started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		System.out.println("Test case passed"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case fail"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test case skipped"+result.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Test exectution finished");
	}

}
