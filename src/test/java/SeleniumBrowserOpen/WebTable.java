package SeleniumBrowserOpen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> rowNumber = driver.findElements(By.tagName("tr"));
		System.out.println(rowNumber.size());
		List<WebElement> colNumber = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td"));
		System.out.println(colNumber.size());
		for(int r = 1 ; r<=rowNumber.size();r++) {
			for(int c = 1 ; c<=colNumber.size();c++) {
				System.out.print(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+r+"]/td["+c+"]")).getText()+"   ");
			}
		System.out.println();
	}
		Thread.sleep(10000);
		driver.close();
	}
}
