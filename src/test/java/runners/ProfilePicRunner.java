package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\ProfilePicture.feature"},
		
		glue = {"stepdefinitions", "hooks"},
		
		plugin = {"pretty"},
		
		tags = "not @functional"
		
		
		)

public class ProfilePicRunner extends AbstractTestNGCucumberTests {

}
