package WebDriverU.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsSteps {

	// Set up webdriver
	WebDriver driver;

	@Before()

	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/timmanas/ProgrammingProjects/CucumberFramework/CucumberFramework/src/test/java/CucumberFramework/resources/chromedriver");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		System.out.println("Finished Setup");
	}

//	@After
//	public void tearDown() {
//		if (driver != null) {
//			driver.manage().deleteAllCookies();
//			driver.quit();
//			driver = null;
//		}
//	}
	
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
	

	@When("^I go to StackOverFlow$")
	public void i_go_to_StackOverFlow() throws Throwable {
		driver.get("https://www.stackoverflow.com/");
	}




}