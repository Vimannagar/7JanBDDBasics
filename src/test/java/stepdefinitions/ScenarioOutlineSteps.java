package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {

	@Given("User is at the signup page")
	public void user_is_at_the_signup_page() {
	   System.out.println("Given statement");
	}

	@When("User enters {string} in form")
	public void user_enters_in_form(String string) {
	  System.out.println("When statement for name and value is "+string);
	}

	@When("User enters {string} inside form")
	public void user_enters_inside_form(String string) {
	  System.out.println("When statement for age and age is "+string);
	}

	@When("User select {string} inside the form")
	public void user_select_inside_the_form(String string) {
	   System.out.println("When statement for selecting gender: "+string);
	}

}
