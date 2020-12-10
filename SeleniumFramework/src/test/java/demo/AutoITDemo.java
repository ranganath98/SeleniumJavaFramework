package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	public static void main(String[] args) throws Exception {
		test();
	}
	public static void test() throws Exception {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tinyupload.com/");
		System.out.println("click");
		driver.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\chenn\\Desktop\\eclipse\\FileUploadScript.exe");
		
		Thread.sleep(3000);
		driver.close();
		
		
	}
}
