package SeleniumBrowserOpen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String str = "search-input1";
		System.out.println(presence(str));
		driver.close();
	}
	
	public static boolean presence(String str) {
		try {
			
			WebElement element = driver.findElement(By.className(str));
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			System.out.println("Exception occured");
		}
		return true;
	}
}
