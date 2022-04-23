package SeleniumBrowserOpen;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1 extends Basetest {
	
	@Test
	public void takeScreenShot() {
		startSession("https://demoqa.com/droppable/");
		Assert.fail();
		tearDown();
		
	}

}
