package gpractice;

import org.openqa.selenium.By;

public class XPathPractice extends Basetest2{
	public static void main(String[] args) throws InterruptedException {
		startSession("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		getDriver().findElement(By.xpath("//input[@name = \"firstname\"]")).sendKeys("Gagan");
		getDriver().findElement(By.xpath("//input[@name = \"lastname\"]")).sendKeys("Gagan");
		getDriver().findElement(By.xpath("//input[@name = \"sex\"][2]")).click();
		getDriver().findElement(By.xpath("//input[@value = '3']")).click();
		getDriver().findElement(By.xpath("//input[@name= 'key']")).sendKeys("Apr 27");
		getDriver().findElement(By.xpath("//select[@name = 'selenium_commands']//option[2]")).click();
		getDriver().findElement(By.xpath("//button[@name = 'submit']")).click(); 
		
		Thread.sleep(10000);
		tearDown();		
	}
}
