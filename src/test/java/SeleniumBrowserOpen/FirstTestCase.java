package SeleniumBrowserOpen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.wikipedia.org/");
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("anc123@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Try again']")));
		driver.findElement(By.xpath("//span[text()='Try again']")).click();
		driver.close();
	}
	//imlicit wait
			// explicit wait
			// fluent wait
			// thread.sleep -- hard wait
}
