package SeleniumBrowserOpen;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExe extends Basetest{
	public static void main(String[] args) throws InterruptedException {
		startSession("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_style_color");
		//startSession("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		/*getDriver().switchTo().frame("iframeResult");
		WebElement element = getDriver().findElement(By.xpath("/html/body/button"));
		//element.click();
		//((JavascriptExecutor)getDriver()).executeScript("document.getElementById('demo').innerHTML = Date()", element);
		((JavascriptExecutor)getDriver()).executeScript("onclick", element);*/

		getDriver().switchTo().frame("iframeResult");
		WebElement element = getDriver().findElement(By.xpath("//*[@id=\"myDiv\"]"));
		((JavascriptExecutor)getDriver()).executeScript("document.getElementById(\"myDiv\").style.color=\"lightblue\"", element);
		
		
		Thread.sleep(3000);
		tearDown();

	}
}
