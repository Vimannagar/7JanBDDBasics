package execution;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomePageSteps {

HomePage homepage = new HomePage(DriverFactory.getDriver());
	
	
@Given("User is at the landing page")
public void user_is_at_the_landing_page() {
 WebDriver driver =  DriverFactory.getDriver(); 
  driver.get("https://www.policybazaar.com/");
}

@Then("Title of page should contains {string}")
public void title_of_page_should_contains(String expectedtitle) throws InterruptedException {
String title = homepage.getTitleOfPage();

	boolean ispresent = title.contains(expectedtitle);
	
	Assert.assertTrue(ispresent);
	
}

@When("User clicks on Term Life insurance")
public void user_clicks_on_term_life_insurance() {
    homepage.navToTermPage();
}

@Then("User should get redirect to {string}")
public void user_should_get_redirect_to(String expectedtermtitle) throws InterruptedException {
	String title = homepage.getTitleOfPage();
	
	boolean ispresent = title.contains(expectedtermtitle);
	
	Assert.assertTrue(ispresent);
}


@When("user enters name as {string}")
public void user_enters_name_as(String name) throws InterruptedException {
	homepage.navToTermPage();
	
	homepage.enteringDetails(name);
	
}

@When("user enters date as {string}")
public void user_enters_date_as(String dob) {
    homepage.enterDOB(dob);
}

@When("user enters mobile number as {string}")
public void user_enters_mobile_number_as(String mob) {
	 homepage.enterMobile(mob);
}

@When("User clicks on view free quotes button")
public void user_clicks_on_view_free_quotes_button() {
   homepage.clickOnFreeQuote();
}

}
