package testNGPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02_DragAndDropClass2 extends Basetest{
	
	
	@BeforeClass
	public static void beforeClass() throws InterruptedException {

		System.out.println("class 2 beforeClass");
		
		
	}
	
	@AfterClass
	public static void afterClass() throws InterruptedException {

		System.out.println("class 2  afterClass");
		
		
	}
	
	
	@BeforeMethod
	public static void beforeMethod() throws InterruptedException {

		System.out.println("class 2  beforeMethod");
		
		
	}
	
	@AfterMethod
	public static void afterMethod() throws InterruptedException {

		System.out.println("class 2 afterMethod");
		
		
	}
	
	@Test
	public static void multiply() throws InterruptedException {

		System.out.println("class 2 multiply");
		
		
	}
	
	
	@Test
	public static void sum() throws InterruptedException {

		System.out.println("class 2 sum");
		
		
	}
	
	@Test
	public static void Add() throws InterruptedException {

		System.out.println("class 2 add");
		
		
	}
}
