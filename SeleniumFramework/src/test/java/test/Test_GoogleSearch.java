package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_GoogleSearch {
	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
		private static void googleSearch() throws InterruptedException {
			String location=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", location+"/lib/chromedriver/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			//goto Google.com
			driver.get("https://google.com/");
			
			//enter the text in textbox
			driver.findElement(By.name("q")).sendKeys("Google");
			
			//click onsearch button
			//driver.findElement(By.name("btnK")).click();
			//enter key
			driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
			
			Thread.sleep(5000);
			//close browser
			driver.close();
			
			System.out.println("Test Completed..");

		}
}
