package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User is at the login screen")
	public void preCondition()
	{
		System.out.println("Given statement");
	}

	
	@When("User enters the username")
	public void enterUsername()
	{
		System.out.println("Entering username");
	}
	
	@When("User enters the password")
	public void enterPassword()
	{
		System.out.println("Entering password");
	}
	
	@When("User clicks on login button")
	public void clickOnLogin()
	{
		System.out.println("Clicking on Login button");
	}
	
	@Then("User should get redirect to the home page")
	public void validateResult()
	{
		System.out.println("Validating result");
	}
	
}
