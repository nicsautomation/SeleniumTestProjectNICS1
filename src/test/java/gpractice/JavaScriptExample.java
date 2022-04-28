package gpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import SeleniumBrowserOpen.Basetest;

public class JavaScriptExample extends Basetest2{
	public static void main(String[] args) throws InterruptedException {		
		
			startSession("https://www.facebook.com/");	
			
			((JavascriptExecutor)getDriver()).executeScript("document.getElementById('email').value='Selenium'");
			((JavascriptExecutor)getDriver()).executeScript("document.getElementById('pass').value='Selenium'");
			
			WebElement element = getDriver().findElement(By.xpath("//*[@id=\"u_0_d_jq\"]"));
			((JavascriptExecutor)getDriver()).executeScript("arguments[0].click();", element);
			//	element.click();
			
			
			
		
			Thread.sleep(3000);
			tearDown();

	}

}
