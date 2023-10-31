package co.techstore.Utility;


import org.testng.ITestListener;
import org.testng.ITestResult;

import co.techstore.Testbase.Testbase;

public class ListenerSetup extends Testbase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("TestCase is Started" +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("TestCase is Passed" +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		Utill.screnShot(result.getName());
		
		System.out.println("TestCase is Failed" +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("TestCase is Skipped" +result.getName());
	}

	

}
