package test;

import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	private static ChromeDriver driver;
	public static void main(String[] args) {
		googleSearchTest();
	}
	public static void googleSearchTest() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/lib/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects pageObjects = new GoogleSearchPageObjects(driver);
		driver.get("https://google.com/");
		pageObjects.setSearchText("A B C");
		pageObjects.clickButton();
		driver.close();
		

	}
}
