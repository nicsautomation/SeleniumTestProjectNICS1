package testNGPractice;


import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

public class TC01_DragAndDropClass3 extends Basetest{
	
	
	
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
	public void multiply() throws InterruptedException, IOException {
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println("TC03");
		System.out.println("TC03");
		
	}
	
	
	//Parallel execution
	//Maven - 1 hour
	// saucelabs
	// jenkins
	//Test --> 
	//Debugging
	
	
}
