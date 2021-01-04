package CucumberFramework.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	@Given("^User navigates to stackoverflow website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable {
		System.out.println("Hello World");
	}

	@Given("^User clicks on login button on homepage$")
	public void user_clicks_on_login_button_on_homepage() throws Throwable {

	}

	@Given("^User enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {

	}

	@Given("^User enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {

	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {

	}

	@Then("^User should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable {

	}
	
	
	@Given("^User navigates to stackoverflow website(\\d+)$")
	public void user_navigates_to_stackoverflow_website(int arg1) throws Throwable {
		System.out.println("Hello World2");
	}

	@Given("^User clicks on login button on homepage(\\d+)$")
	public void user_clicks_on_login_button_on_homepage(int arg1) throws Throwable {

	}

	@Given("^User enters a valid username(\\d+)$")
	public void user_enters_a_valid_username(int arg1) throws Throwable {

	}

	@Given("^User enters a valid password(\\d+)$")
	public void user_enters_a_valid_password(int arg1) throws Throwable {

	}

	@When("^User clicks on the login button(\\d+)$")
	public void user_clicks_on_the_login_button(int arg1) throws Throwable {

	}

	@Then("^User should be taken to the successful login page(\\d+)$")
	public void user_should_be_taken_to_the_successful_login_page(int arg1) throws Throwable {

	}

}
