package gpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleniumBrowserOpen.Basetest;

public class RightClickExample extends Basetest {
	public static void main(String[] args) throws InterruptedException {
		startSession("https://demoqa.com/droppable/");
		Actions action = new Actions(getDriver());
		WebElement element = getDriver().findElement(By.id("draggable"));
		 action.contextClick(element).build().perform(); 
	
			// COULD NOT figure this out 
		
		//action.moveToElement(element).contextClick(element).perform();
		//action.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		
		Thread.sleep(3000);
		tearDown();

	}
}
