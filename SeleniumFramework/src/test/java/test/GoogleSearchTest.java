package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	private static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
		private static void googleSearch() throws InterruptedException {
			String location=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", location+"/lib/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
			
			//goto Google.com
			driver.get("https://google.com/");
			
			//enter the text in textbox
			GoogleSearchPage.textbox_search(driver).sendKeys("Google");
			
			//click onsearch button
			//driver.findElement(By.name("btnK")).click();
			
			//enter key
			GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
			
			Thread.sleep(5000);
			//close browser
			driver.close();
			
			System.out.println("Test Completed..");

		}
}
