package gpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SeleniumBrowserOpen.Basetest;

public class IframeExample extends Basetest {
	public static void main(String[] args) throws InterruptedException {
		startSession("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		getDriver().switchTo().frame(0);
		click(getDriver().findElement(By.xpath("/html/body/button")));
		Thread.sleep(3000);
		tearDown();
	}
}
