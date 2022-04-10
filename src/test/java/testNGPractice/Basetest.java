package testNGPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {

	private WebDriver driver;
	

	public WebDriver getDriver() {
		return driver;
	}


	public void startSession(String url) throws MalformedURLException {
		//ChromeOptions options = new ChromeOptions();
		
		WebDriverManager.iedriver().browserVersion("100.0.1185.36").setup();
		InternetExplorerOptions fo = new InternetExplorerOptions();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("InternetExplorer");
		fo.merge(cap);
		driver = new RemoteWebDriver( new URL("http://10.0.0.203:5565/wd/hub") , cap);
		driver.get(url);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public void tearDown() {
		driver.quit();
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	
	public void sendkeys(WebElement element , String Value) {
		element.sendKeys(Value);
	}
	
}
