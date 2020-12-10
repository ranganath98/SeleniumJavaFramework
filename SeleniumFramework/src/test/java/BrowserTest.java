import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		String location=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", location+"/lib/chromedriver/chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", location+"/lib/edgedriver/msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
	//	System.setProperty("webdriver.ie.driver", location+"/lib/IEdriver/IEDriverServer.exe");
	//	WebDriver driver = new InternetExplorerDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("google");
		
		List<WebElement> elements = driver.findElements(By.xpath("//input"));
		System.out.println(elements.size());
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("google");
//		element.findElement(By.xpath("1")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}

}
