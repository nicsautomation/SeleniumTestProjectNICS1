package SeleniumBrowserOpen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot extends Basetest{
	public static void main(String[] args) throws InterruptedException, IOException {
		startSession("https://demoqa.com/droppable/");
		File file = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//ScreenShots/err.jpg"));
		Thread.sleep(3000);
		tearDown();
	}
}
