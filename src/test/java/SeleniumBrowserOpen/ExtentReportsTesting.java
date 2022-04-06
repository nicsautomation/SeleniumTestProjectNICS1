package SeleniumBrowserOpen;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsTesting extends Basetest{

	@Test
	public static void generateExtentReport() {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");
		extent.attachReporter(spark);
		extent.createTest("FirstTestCase").log(Status.PASS, "testcase got passed");
		extent.flush();
	}

}
