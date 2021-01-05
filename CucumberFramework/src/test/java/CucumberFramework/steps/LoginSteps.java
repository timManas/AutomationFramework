package CucumberFramework.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
	
	// Set up webdriver
	WebDriver driver;
	
	@Before()
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/timmanas/ProgrammingProjects/CucumberFramework/CucumberFramework/src/test/java/CucumberFramework/resources/chromedriver");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		System.out.println("Finished Setup");
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
			driver = null;
		}
	}
	
	
	@Given("^User navigates to stackoverflow website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable {
		driver.get("https://stackoverflow.com/");
		
	}

	@Given("^User clicks on login button on homepage$")
	public void user_clicks_on_login_button_on_homepage() throws Throwable {
		driver.findElement(By.xpath("/html//div[@role='menubar']/ol[2]//a[@href='https://stackoverflow.com/users/login?ssrc=head&returnurl=https%3a%2f%2fstackoverflow.com%2f']")).click();
		
	}

	@Given("^User enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html//input[@id='email']")).sendKeys("timothy.romero.manas@gmail.com");
		
	}

	@Given("^User enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html//input[@id='password']")).sendKeys("06951789s");
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.xpath("/html//button[@id='submit-button']")).click();
	}

	@Then("^User should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
		Thread.sleep(3000);
		WebElement askQuestionsButton = driver.findElement(By.xpath("/html//div[@id='mainbar']//a[@href='/questions/ask']"));
		Assert.assertEquals(true, askQuestionsButton.isDisplayed());
	}
	
	


}
