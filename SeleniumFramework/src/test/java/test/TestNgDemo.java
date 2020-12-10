package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNgDemo {
	public 	static String browserName=null;
		static WebDriver driver=null;
		@BeforeTest
		public static void setUpest() {
			String location=System.getProperty("user.dir");
			PropertiesFile.getProperties();
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", location+"/lib/chromedriver/chromedriver.exe");
				driver = new ChromeDriver();
			}
		}
		@Test
		public static void googleSearch(){
			//goto Google.com
			driver.get("https://google.com/");
			
			//enter the text in textbox
			driver.findElement(By.name("q")).sendKeys("Google");
			
			//click onsearch button
			//driver.findElement(By.name("btnK")).click();
			//enter key
			driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		}
		@AfterTest
		public static void close() {
			//close browser
			driver.close();
			driver.quit();
			System.out.println("Test Completed..");
			PropertiesFile.setProperties();
			}
}
