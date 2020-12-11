package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SauceLabsDemo {
	public static final String USERNAME = "RanganathChenna";
	public static final String ACCESS_KEY = "840538b9-4c0d-4a71-bb7a-d9dbaf6c4199";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Linux");
		caps.setCapability("version", "latest");
		caps.setCapability("name", "GoogleTest1");
		caps.setCapability("extendedDebugging", "true");
		caps.setCapability("buildNumber", "3.0");

		//WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);

				String projectPath = System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automobile");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		System.out.println(driver.getTitle());

		driver.quit();
		System.out.println("Test Completed");
	}
}
