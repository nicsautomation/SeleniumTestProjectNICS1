package SeleniumBrowserOpen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClick extends Basetest {

	public static void main(String[] args) throws InterruptedException {
		startSession("https://demoqa.com/droppable/");
		Actions action = new Actions(getDriver());
		WebElement element = getDriver().findElement(By.id("draggable"));
		action.contextClick(element).perform();
		Thread.sleep(3000);
		tearDown();

	}

}
