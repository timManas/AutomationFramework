package WebDriverU.steps;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	// Set up webdriver
	WebDriver driver;

	@Before()
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/timmanas/ProgrammingProjects/CucumberFramework/CucumberFramework/src/test/java/CucumberFramework/resources/chromedriver");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		System.out.println("Finished Steps Setup");
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
			driver = null;
		}
	}
	
	// Contact Us ===========
	
	@Given("^Print Hello World$")
	public void print_Hello_World() throws Throwable {
		System.out.println("Hello World");
	}


	@Given("^I access webdriveruniversity$")
	public void i_access_webdriveruniversity() throws Throwable {
		driver.get("https://webdriveruniversity.com/");
	}

	@When("^I click on the contact us button$")
	public void i_click_on_the_contact_us_button() throws Throwable {

	}
	
	@When("^I enter a valid first name$")
	public void i_enter_a_valid_first_name() throws Throwable {
		
	}

	@When("^I enter a valid first name using DataTables$")
	public void i_enter_a_valid_first_name_using_DataTables(DataTable dataTable) throws Throwable {
		System.out.println("DataFrame Example");
		List<List<String>> table = dataTable.raw();
		for (int i=0; i < table.size(); i++) {
			for (int j=0; j < table.get(i).size(); j++ ) {
				System.out.println("Table Value: " + table.get(i).get(j));
			}
		}
	}



	@When("^I enter a valid last name$")
	public void i_enter_a_valid_last_name() throws Throwable {

	}

	@When("^I enter a valid email address$")
	public void i_enter_a_valid_email_address() throws Throwable {

	}

	@When("^I enter comments$")
	public void i_enter_comments() throws Throwable {
		System.out.println("Enter Comments");
	}

	@Then("^the information should successfully be submitted via the contact us form$")
	public void the_information_should_successfully_be_submitted_via_the_contact_us_form() throws Throwable {

	}

	@Given("^I enter a non valid first name$")
	public void i_enter_a_non_valid_first_name() throws Throwable {

	}

	@Given("^I enter a non valid last name$")
	public void i_enter_a_non_valid_last_name() throws Throwable {

	}

	@Given("^I enter a non valid email address$")
	public void i_enter_a_non_valid_email_address() throws Throwable {

	}

	@Given("^I enter no comments$")
	public void i_enter_no_comments() throws Throwable {
		System.out.println("Enter No Comments");
	}

	@When("^I click on the submit button$")
	public void i_click_on_the_submit_button() throws Throwable {

	}

	@Then("^the information should not be successfully be submitted via the contact us form$")
	public void the_information_should_not_be_successfully_be_submitted_via_the_contact_us_form() throws Throwable {

	}

	@Then("^the user should also be notified of the problem$")
	public void the_user_should_also_be_notified_of_the_problem() throws Throwable {
		
	}
	
	// Login ============
	
	@When("^I click on the login portal button$")
	public void i_click_on_the_login_portal_button() throws Throwable {
		driver.findElement(By.id("login-portal")).click();
	}

	@When("^I enter a username$")
	public void i_enter_a_username() throws Throwable {
		@SuppressWarnings("unused")
		String winHandlerBefore = driver.getWindowHandle();
	
		// Toggles between different Tabs
		for(String winHandler: driver.getWindowHandles()) {
			driver.switchTo().window(winHandler);
		}
		
		driver.findElement(By.id("text")).sendKeys("webdriver");
	}

	@When("^I enter a \"([^\"]*)\" password$")
	public void i_enter_a_password(String password) throws Throwable {
		System.out.println("Password: " + password);
		driver.findElement(By.id("password")).sendKeys(password); 
	}

	@When("^I click on the login button$")
	public void i_click_on_the_login_button() throws Throwable {
		driver.findElement(By.id("login-button")).click();

	}

	@Then("^I should be presented with a succesfful validation alert$")
	public void i_should_be_presented_with_a_succesfful_validation_alert() throws Throwable {
		Thread.sleep(300);
		Alert alert = driver.switchTo().alert();
		System.out.println("Result: " + alert.getText());
		

		Assert.assertEquals(alert.getText(), "validation succeeded");	// Checks Value
		alert.accept();		// Clicks on Ok Accept
	}
	
	@Then("^I should be presented with a unsuccesfful validation alert$")
	public void i_should_be_presented_with_a_unsuccesfful_validation_alert() throws Throwable {
		Thread.sleep(300);
		Alert alert = driver.switchTo().alert();
		System.out.println("Result: " + alert.getText());
		
		
		Assert.assertEquals(alert.getText(), "validation failed"); // Checks Value
		alert.accept(); // Clicks on Ok Accept
	}
	
	// Login using Scenario Outlines ============

	
	@Given("^user navigates to \"([^\"]*)\"$")
	public void user_navigates_to(String url) throws Throwable {
		driver.get(url);  //http://www.webdriveruniversity.com/
	}
	

	@When("^user clicks on the login portal button$")
	public void user_clicks_on_the_login_portal_button() throws Throwable {
		driver.findElement(By.id("login-portal")).click();
	}
	

	@And("^user enters the \"([^\"]*)\" username$")
	public void user_enters_the_username(String username) throws Throwable {
		System.out.println("Username: " + username);
		//tab code
		for (String windHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windHandle);
		}
		
		driver.findElement(By.id("text")).sendKeys(username);	//send username keys

	}

	@And("^user enter the \"([^\"]*)\" password$")
	public void user_enter_the_password(String password) throws Throwable {
		System.out.println("Password: " + password);
		driver.findElement(By.id("password")).sendKeys(password);	
	}
	

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.id("login-button")).click();
	}
	

	@Then("^the user should be presented with the following prompt alert \"([^\"]*)\"$")
	public void the_user_should_be_presented_with_the_following_prompt_alert(String message) throws Throwable {
		Alert alert = driver.switchTo().alert(); //Alert	
		assertEquals(alert.getText().toString().toLowerCase().replaceAll("\\s", ""), message.toLowerCase().replaceAll("\\s", ""));
		alert.accept();
	}
	
	// ===================


}
