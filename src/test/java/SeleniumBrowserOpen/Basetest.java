package SeleniumBrowserOpen;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {

	private static WebDriver driver;
	

	public static WebDriver getDriver() {
		return driver;
	}


	@Test
	public void beforeTest(Method method) {
	System.out.println(method.getName());
		
}
	
	
	public static void startSession(String url) {
		//System.out.println(m.getName());
		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setAcceptInsecureCerts(true);
		HashMap<String, String> mobile_Emulation= new HashMap<String, String>();
		mobile_Emulation.put("deviceName", "iPhone SE");
		options.setExperimentalOption("mobileEmulation", mobile_Emulation);
		driver = new ChromeDriver(options);
		driver.get(url);
		//driver.manage().window().maximize();
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
