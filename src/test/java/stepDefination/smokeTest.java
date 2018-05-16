package stepDefination;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTest {

	WebDriver driver;

	@Given("^Open Chrome and navigation to Google$")
	public void open_Chrome_and_navigation_to_Google() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\9_Selenium_grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com.vn");
	}

	@When("^I am enter the valid username and password$")
	public void i_am_enter_the_valid_username_and_password() throws Throwable {
		driver.findElement(By.id("lst-ib")).sendKeys("Testing");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
	}

	@Then("^user should be login successfully$")
	public void user_should_be_login_successfully() throws Throwable {
		driver.getCurrentUrl();
		driver.close();
	}

}
