package testNGPractice;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02_DragAndDropClass5 extends Basetest{
	
	@Test(groups = "sanity")
	public void multiply() throws InterruptedException, MalformedURLException {
		// Hard , soft assertions
		//Assert.assertEquals("ABC", "XYZ");
		//Assert.assert(true);
		/*
		 * SoftAssert sf = new SoftAssert(); sf.assertEquals("ABC", "XYZ");
		 * System.out.println("multiply"); sf.assertEquals("ABC", "def");
		 * sf.assertAll("testcase failed");
		 */
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println("TC02");
		startSession("https://google.com");
		File file = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(".//ScreenShots/err.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(3000);
		tearDown();
		System.out.println("TC02");
		
	}
}
