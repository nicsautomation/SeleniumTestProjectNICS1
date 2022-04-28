package gpractice;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest2 {
private static WebDriver driver;
	

	public static WebDriver getDriver() {
		return driver;
	}


	public static void startSession(String url) {
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public static void tearDown() {
		driver.quit();
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	
	public static void sendkeys(WebElement element , String Value) {
		element.sendKeys(Value);
	}

}
