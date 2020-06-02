package rvinfotech.listener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListen implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("New Test Started >> " +result.getName());
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println(
				"--------------------------------------------------------------------------------------------------------");
		System.out.println("		" + result.getName() + " 		  SUCCESS");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------");
	}
		
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println(
				"--------------------------------------------------------------------------------------------------------");
		System.out.println("		" + result.getName() + " 		  FAILURE");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------");
	}
		
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println(
				"--------------------------------------------------------------------------------------------------------");
		System.out.println("		" + result.getName() + " 		  SKIPPED");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------");
	}
		
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("Test Failed but within success percentage" +result.getName());
		
	}
	@Override
	public void onStart(ITestContext context) {
		
		
		System.out.println("This is onStart method" +context.getOutputDirectory());
		
	}
	@Override
	public void onFinish(ITestContext context) {
			
		System.out.println("This is onFinish method" +context.getPassedTests());
		System.out.println("This is onFinish method" +context.getFailedTests());
	}
}
