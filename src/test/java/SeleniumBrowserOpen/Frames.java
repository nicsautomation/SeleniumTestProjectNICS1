package SeleniumBrowserOpen;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frames extends Basetest{
	
	
	public static void main(String[] args) throws InterruptedException {
		startSession("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		List<WebElement> elements = getDriver().findElements(By.tagName("iframe"));
		for(WebElement element:elements) {
			System.out.println(element.getText());
			System.out.println(element.getAttribute("name"));
		}
		getDriver().switchTo().frame("iframeResult");
		click(getDriver().findElement(By.xpath("/html/body/button")));
		getDriver().switchTo().defaultContent();
		click(getDriver().findElement(By.xpath("//button[@id=\"runbtn\"]")));
		Thread.sleep(3000);
		tearDown();
	}

}
