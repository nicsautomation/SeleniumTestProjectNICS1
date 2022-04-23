package ListenerTest;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import SeleniumBrowserOpen.Basetest;


public class listernerClass implements ITestListener {
	

		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
		
		}

		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
		
		}

		
		public void onTestFailure(ITestResult result) {
			
			File file = ((TakesScreenshot) Basetest.getDriver()).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(file, new File(".//ScreenShots/err.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
		public void onTestSkipped(ITestResult result) {
			
		}

		
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
		
		}

		
		public void onTestFailedWithTimeout(ITestResult result) {
			// TODO Auto-generated method stub
		
		}

		
		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
		
		}

		
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
		
		}

		


}
