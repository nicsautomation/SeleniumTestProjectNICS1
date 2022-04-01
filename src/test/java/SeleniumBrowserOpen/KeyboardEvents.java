package SeleniumBrowserOpen;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents extends Basetest{
	public static void main(String[] args) throws InterruptedException {
		startSession("https://mail.rediff.com/cgi-bin/login.cgi");
		Actions action = new Actions(getDriver());
		//action.sendKeys(Keys.ENTER).perform();
		//WebElement element = getDriver().findElement(By.xpath("//input[@class='signinbtn']"));
		//element.sendKeys(Keys.ENTER);
		action.sendKeys(Keys.chord(Keys.CONTROL + "c")).build().perform();
		Thread.sleep(3000);
		tearDown();

	}

}
