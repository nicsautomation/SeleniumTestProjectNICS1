package gpractice;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import SeleniumBrowserOpen.Basetest;

public class SendKeys extends Basetest{
	public static void main(String[] args) throws InterruptedException {
		startSession("https://www.wikipedia.org/");
		Actions action = new Actions(getDriver());

		WebElement element = getDriver().findElement(By.xpath("//body"));
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		element.sendKeys(Keys.chord(Keys.CONTROL, "c"));

		WebElement element2 = getDriver().findElement(By.xpath("//*[@id=\"searchInput\"]"));
		element2.sendKeys(Keys.CONTROL + "v");

		Thread.sleep(10000);
		tearDown();
		

	}
	
}
