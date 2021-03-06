package SeleniumBrowserOpen;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropClass extends Basetest{
	public static void main(String[] args) throws InterruptedException {

		startSession("https://demoqa.com/droppable/");
		WebElement dragable = getDriver().findElement(By.id("draggable"));
		WebElement dropable = getDriver().findElement(By.id("droppable"));
		Actions action = new Actions(getDriver());
		action.dragAndDrop(dragable, dropable).perform();		
		Thread.sleep(3000);
		tearDown();
	}
}
