package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	
	@Given("User should be at login screen")
	public void user_should_be_at_login_screen() {
	 System.out.println("Given statement");
	}

	@When("User enters the username as {string}")
	public void user_enters_the_username_as(String string) {
	    System.out.println("considered username as "+string);
	}

	@When("User enters the password as {string}")
	public void user_enters_the_password_as(String string) {
	  System.out.println("Considered password as "+string);  
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
	  System.out.println("Click on submit button");
	}

	@Then("User should get logged in")
	public void user_should_get_logged_in() {
	   System.out.println("Then for user logged in");
	}

	@When("User enters the username {string}")
	public void user_enters_the_username(String string) {
	   System.out.println("Considered user name as" + string);
	}

	@When("User enters the password {string}")
	public void user_enters_the_password(String string) {
		System.out.println("Considered password as" + string);
	}

	@Then("User gets error message")
	public void user_gets_error_message() {
		System.out.println("Then statement for errror message");
	}


}
