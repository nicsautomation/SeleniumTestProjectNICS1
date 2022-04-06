package Sultan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		startSession("https://www.wikipedia.org/");
		Actions action = new Actions(getDriver());
		//action.sendKeys(Keys.ENTER).perform();
		//WebElement element = getDriver().findElement(By.xpath("//input[@class='signinbtn']"));
		//element.sendKeys(Keys.ENTER);
		getDriver().findElement(By.xpath("//body")).sendKeys(Keys.CONTROL + "a");
		//action.sendKeys(Keys.chord(Keys.CONTROL + "a")).build().perform();
		//action.sendKeys(Keys.CONTROL + "c").perform();
		action.keyDown(Keys.LEFT_CONTROL).perform();
		action.sendKeys("c").perform();
		action.keyUp(Keys.LEFT_CONTROL).perform();
		Thread.sleep(5000);
		getDriver().findElement(By.xpath("//input[@name='search']")).sendKeys(Keys.CONTROL + "v");
		//action.sendKeys(Keys.chord(Keys.CONTROL + "v")).build().perform();
		Thread.sleep(5000);
		tearDown();
	}

}

