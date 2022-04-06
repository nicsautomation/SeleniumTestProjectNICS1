package Sultan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClick extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		startSession("https://www.gsmarena.com/");
		WebElement element = getDriver().findElement(By.xpath("//a[@href='samsung-phones-9.php']"));
		//action.contextClick(element).perform();
		Actions action = new Actions(getDriver());
		action.moveToElement(element);
		Thread.sleep(3000);
		action.contextClick(element).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ENTER).build().perform();
		//action.moveToElement(getDriver.findElement(By.id("draggable").contextClick().build().perform());
	    //getDriver().findElement(By.linkText("Open link in new tab"));
		//action.sendKeys(Keys.valueOf("Open link in new tab")).click();
		//element.click();
		Thread.sleep(3000);
		tearDown();
}
}
//action1.contextClick(gmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform()