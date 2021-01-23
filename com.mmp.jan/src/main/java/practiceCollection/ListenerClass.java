package practiceCollection;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("The name of the testcase started is :"+result.getName());	
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of the testcase Pass is :"+result.getName());	
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The name of the testcase failed is :"+result.getName());	
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The name of the testcase skipped is :"+result.getName());	
	}

	@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		}

	   @Override
		public void onStart(ITestContext context) {
			}
		@Override
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			System.out.println("The name of the testcase finished is :"+context.getName());	
}}





