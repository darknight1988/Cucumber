package stepDefination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://google.com")
public class HomePage extends PageObject {

	WebDriver driver;
	public void search(String keyword) {
		driver.findElement(By.id("lst-ib")).sendKeys("Testing BDD");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		
	}

}
