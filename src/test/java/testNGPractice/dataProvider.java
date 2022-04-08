package testNGPractice;

import org.testng.annotations.DataProvider;

public class dataProvider {

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "abc.com";
		data[0][1] = "1234";
		return data;
		
		
		
	}
	
	
	
	@DataProvider
	public Object[][] getData1() {
		Object[][] data = new Object[3][2];
		data[0][0] = "abc.com";
		data[0][1] = "1234";
		return data;
		
		
		
	}
}
