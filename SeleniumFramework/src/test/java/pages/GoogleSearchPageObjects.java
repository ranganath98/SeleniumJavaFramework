package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class GoogleSearchPageObjects {
	 static WebDriver driver=null;
	  By search_box=By.name("q");
	 By search_button=By.name("btnK");
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	public  void setSearchText(String text) {
		driver.findElement(search_box).sendKeys(text);
	}
	public  void clickButton() {
		driver.findElement(search_button).sendKeys(Keys.RETURN);
	}
}
