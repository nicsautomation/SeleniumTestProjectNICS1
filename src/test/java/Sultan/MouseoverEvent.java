package Sultan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseoverEvent {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//span[@class='udlite-text-sm header--dropdown-button-text--2jtIM']")).click();
		WebElement element = driver.findElement(By.xpath("//span[@class='udlite-text-sm header--dropdown-button-text--2jtIM']"));
		//Select select = new Select(driver.findElement(By.id("u202-popper-content--2")));
		//driver.findElement(By.xpath("//a[@id='header-browse-nav-category-288']"));
		//driver.findElement(By.xpath("//a[@id='header-browse-nav-subcategory-132']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		
		//action.doubleClick();
		Thread.sleep(10000);
		driver.close();
	}
}