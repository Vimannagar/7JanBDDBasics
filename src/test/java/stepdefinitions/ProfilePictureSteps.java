package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilePictureSteps {
	@Given("User is already logged into  application")
	public void user_is_already_logged_into_application() {
	  System.out.println("Given statement");
	}

	@When("User clicks on add profile pic button")
	public void user_clicks_on_add_profile_pic_button() {
	    System.out.println("Click on add profile button");
	}

	@When("Select the image")
	public void select_the_image() {
	    System.out.println("Selecting the image to add");
	}

	@Then("User profile pic should get added")
	public void user_profile_pic_should_get_added() {
	  System.out.println("Profile picture should get added");
	}

	

	@When("User clicks on edit profile picture button")
	public void user_clicks_on_edit_profile_picture_button() {
		System.out.println("Click on Edit profile picture button");
	}

	@When("User updates the image")
	public void user_updates_the_image() {
		System.out.println("Click on update profile button");
	}

	@Then("User profile pic should get updated")
	public void user_profile_pic_should_get_updated() {
		System.out.println("Profile pic gets updated");
	}

	@When("User clicks on Delete profile  picture button")
	public void user_clicks_on_delete_profile_picture_button() {
	    System.out.println("Click on delete prfile pic button");
	}

	@Then("User profile picture should get deleted")
	public void user_profile_picture_should_get_deleted() {
	  System.out.println("Profile pic gets deleted");
	}


}
