package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	private static WebDriver driver=null;
	public static void main(String[] args) {

		// start reporters
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test1 = extent.createTest("Google Search one", "to validate google search functionality");//Testname,description

		String location=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", location+"/lib/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		// log(Status, details)
		test1.log(Status.INFO, "starting test case");
		driver.get("https://google.com/");
		test1.pass("Navigated to google");
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("entered the text");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("press the enter in keys");
		driver.close();
		driver.quit();
		test1.pass("browser closed");
		test1.info("Test Completed");


		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test2 = extent.createTest("Google Search two", "to validate google search functionality");//Testname,description

		System.setProperty("webdriver.chrome.driver", location+"/lib/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		// log(Status, details)
		test2.log(Status.INFO, "starting test case");
		driver.get("https://google.com/");
		test2.pass("Navigated to google");
		driver.findElement(By.name("q")).sendKeys("Automation");
		test2.pass("entered the text");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test2.fail("press the enter in keys");
		driver.close();
		driver.quit();
		test2.warning("browser closed");
		test1.info("Test Completed");
		extent.flush();

	}
}
