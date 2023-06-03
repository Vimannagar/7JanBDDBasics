package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {
	
	@Given("User should be logged into the application")
	public void user_should_be_logged_into_the_application() {
	   System.out.println("Given statement from background");
	}

//	CTRL + SHIFT + O --> To perform bulk import of non imported items
	@When("User click on orders button")
	public void user_click_on_orders_button() {
		  System.out.println("When statement from background");
	}

	@Then("User should see order category")
	public void user_should_see_order_category() {
		  System.out.println("Then statement from background");
	}

	@When("user clicks on past order button")
	public void user_clicks_on_past_order_button() {
	  System.out.println("When for past order");
	}

	@Then("user should be able to see past order information")
	public void user_should_be_able_to_see_past_order_information() {
		System.out.println("Then for past order");
	}

	@When("user clicks on current order button")
	public void user_clicks_on_current_order_button() {
		System.out.println("When for current order");
	}

	@Then("user should be able to see current order information")
	public void user_should_be_able_to_see_current_order_information() {
		System.out.println("Then for current order");
	}

}
