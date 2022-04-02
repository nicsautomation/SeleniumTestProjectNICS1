package SeleniumBrowserOpen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OptionsSelenium extends Basetest{
	public static void main(String[] args) {
		startSession("https://cacert.org/");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tearDown();
	}
}
