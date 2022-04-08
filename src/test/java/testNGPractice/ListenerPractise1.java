package testNGPractice;

import org.testng.ITestListener;
import org.testng.ITestResult;

;	

public class ListenerPractise1 implements ITestListener	{

	
	public void onTestStart(ITestResult result) {
	    System.out.println("statrting the test");
	  }

	public void onTestFailure(ITestResult result) {
	    System.out.println("failing the test");
	  }

	public void onTestSuccess(ITestResult result) {
		 System.out.println("success the test");
	  }
}
