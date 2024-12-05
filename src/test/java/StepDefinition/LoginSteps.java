package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Inside Step-user is on the login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside Step-user enter username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside Step-clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside Step-user is navigated to the home page");
	}
	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step-user enters invalid username and password");
	}

	@Then("error message is displayed - Invalid Credentials")
	public void error_message_is_displayed_invalid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step-error message is displayed - Invalid Credentials");
	}

}
