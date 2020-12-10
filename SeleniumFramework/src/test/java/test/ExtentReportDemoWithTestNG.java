package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemoWithTestNG {
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	static WebDriver driver;
	@BeforeSuite
	public void setUp() {
		htmlReporter = new ExtentSparkReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@BeforeTest
	public static void setUpest() {
		String location=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", location+"/lib/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void text1() {
		 // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        driver.get("https://google.com/");
        test.pass("Navigated to google");
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	@Test
	public void text2() {
		 // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	@AfterTest
	public static void close() {
		//close browser
		driver.close();
		System.out.println("Test Completed..");
	}
	@AfterSuite
	public void tearDown() {
		// calling flush writes everything to the log file
        extent.flush();
	}
}
