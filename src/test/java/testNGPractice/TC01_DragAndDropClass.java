package testNGPractice;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

public class TC01_DragAndDropClass extends Basetest{
	
	
	
	public static void beforeClass() throws InterruptedException {

		System.out.println("beforeClass");
		
		
	}
	
	
	public static void afterClass() throws InterruptedException {

		System.out.println("afterClass");
		
		
	}
	
	
	
	public static void beforeMethod() throws InterruptedException {

		System.out.println("beforeMethod");
		
		
	}
	
	
	public static void afterMethod() throws InterruptedException {

		System.out.println("afterMethod");
		
		
	}
	
	@Test(groups = "sanity")
	public static void multiply() throws InterruptedException {
		// Hard , soft assertions
		//Assert.assertEquals("ABC", "XYZ");
		//Assert.assert(true);
		/*
		 * SoftAssert sf = new SoftAssert(); sf.assertEquals("ABC", "XYZ");
		 * System.out.println("multiply"); sf.assertEquals("ABC", "def");
		 * sf.assertAll("testcase failed");
		 */
		System.out.println("multiply");
		
	}
	
	// Parallel execution
	@Test(groups = "prod")
	public static void sum() throws InterruptedException {
		//Assert.assertEquals("ABC", "XYZ");
		throw new SkipException("skipping the testcase");
		
		
		
	}
	
	@Test(groups = "regression") @Parameters({"browser"})
	public static void Add(String browser) throws InterruptedException {

		System.out.println(browser);
		//System.out.println(passWord);
		System.out.println("add");
		
		
	}
	
	
	
}
