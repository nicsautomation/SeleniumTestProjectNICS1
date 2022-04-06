package Sultan;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenSht extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		startSession("https://www.gsmarena.com/");
		File file = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//ScreenShots/err.jpg"));
		Thread.sleep(3000);
		tearDown();
}
}
