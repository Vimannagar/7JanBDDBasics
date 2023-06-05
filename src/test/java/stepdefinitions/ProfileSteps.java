package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	

@Given("User is already logged into the application")
public void user_is_already_logged_into_the_application() {
    System.out.println("Given statement for home page");
}

@When("User clicks on add profile button")
public void user_clicks_on_add_profile_button() {
    System.out.println("When statement for adding the profile");
}

@When("User enters the details")
public void user_enters_the_details() {
	 System.out.println("When statement for entering the details");
}

@Then("User details should get added")
public void user_details_should_get_added() {
	 System.out.println("Then statement for validate details");
}

@When("User clicks on edit profile button")
public void user_clicks_on_edit_profile_button() {
	System.out.println("When statement for editing the profile");
}

@When("User updates the details")
public void user_updates_the_details() {
	System.out.println("When statement for updating the profile");
}

@Then("User details should get updated")
public void user_details_should_get_updated() {
	System.out.println("then statement for update profile");
}

@When("User clicks on Delete profile button")
public void user_clicks_on_delete_profile_button() {
	System.out.println("When statement for deleting the profile");
}

@Then("User profile should get deleted")
public void user_profile_should_get_deleted() {
	System.out.println("Then statement for deleting profile");
}


}
