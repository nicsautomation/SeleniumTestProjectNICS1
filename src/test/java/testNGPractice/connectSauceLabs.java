package testNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class connectSauceLabs {

	public static final String USERNAME = "kaur938";
	  public static final String ACCESS_KEY = "c44d5a12-0f9a-43ab-a2c4-245ecf1abd54";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	 
	@Test
	public void connectWithSauceLabs() throws MalformedURLException, InterruptedException {
			Method method;
		    DesiredCapabilities caps = DesiredCapabilities.chrome();
		    caps.setCapability("platform", "Windows 10");
		    caps.setCapability("version", "latest");
		    caps.setCapability("name", "connectSauceLabs");
		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

		    driver.get("https://ca.yahoo.com/?p=us");
		    Thread.sleep(100000);
		    System.out.println("title of page is: " + driver.getTitle());
		 
		    driver.quit();
	}
}
